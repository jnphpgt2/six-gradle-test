package com.jk.controller;

import com.jk.controller.common.fenye.PageUtil;
import com.jk.ws.Book;
import com.jk.ws.WSBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Janan on 2017/5/26.
 */
@Controller
public class BookController {
    @Autowired
    private WSBookService wsService;

   @RequestMapping("getList")
    public ModelAndView getList(ModelAndView mv,String tname,String cpage,Integer pageSize,HttpServletRequest request){
       cpage = cpage==null?"1":cpage;
       pageSize=3;
       String url="";
       Long count = wsService.getCount(tname);
       List<Book> list=wsService.getList(tname,Integer.valueOf(cpage),pageSize);
       if(tname!=null&&tname.trim().length()>0){
           url+="getList.do?tname="+tname+"&";
           mv.addObject("tname",tname);
       }else{
           url+="getList.do?";
       }
       PageUtil.page(request, Integer.valueOf(cpage), pageSize, Integer.valueOf(count.toString()), list, url);
       mv.setViewName("book_list");

       return mv;
   }

}
