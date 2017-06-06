package com.jk.controller.spellCheck;

import com.jk.entity.ResultData;
import com.jk.entity.spellCheck.SpellCheck;
import com.jk.service.spellCheck.SpellCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Janan on 2017/5/27.
 */
@Controller
public class SpellCheckController {
    @Autowired
    private SpellCheckService spellCheckService;

    @ResponseBody
    @RequestMapping("spell_check")
    public ResultData spell_check(@RequestBody HashMap<String,String> keyWord){
        String keyWord1 = keyWord.get("keyWord");
        Integer code=200;
        String msg="成功";
        ResultData resultData = new ResultData();
        List<SpellCheck> keyWordList=spellCheckService.getKeyWord(keyWord1);
        if(keyWordList==null){
            resultData.setCode(201);
            resultData.setMsg("失败");
            resultData.setData(null);
        }
        resultData.setData(keyWordList);
        return resultData;
    }

}
