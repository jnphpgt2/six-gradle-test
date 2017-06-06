package com.jk.controller;

import com.jk.controller.common.fenye.PageUtil;
import com.jk.ws.Book;
import com.jk.ws.WSBookService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Janan on 2017/5/26.
 */
@Controller
public class BookController_test_freemarker {
    @Autowired
    private WSBookService wsService;

   @RequestMapping("getList_1")
    public String getList(ModelMap mv,@RequestParam(value="tname",required = false) String tname,@RequestParam(value="cpage",required = false,defaultValue = "1") String cpage,Integer pageSize,HttpServletRequest request){
       pageSize=3;
       String url="";
       Long count = wsService.getCount(tname);
       List<Book> list=wsService.getList(tname,Integer.valueOf(cpage),pageSize);
       if(tname!=null&&tname.trim().length()>0){
           url+="getList_1.do?tname="+tname+"&";
           mv.addAttribute("tname",tname);
       }else{
           url+="getList_1.do?";
       }
       PageUtil.page(request, Integer.valueOf(cpage), pageSize, Integer.valueOf(count.toString()), list, url);
       return "/student_list";
   }

}
