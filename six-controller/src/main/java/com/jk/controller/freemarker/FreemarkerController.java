package com.jk.controller.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/6/6.
 */
@Controller
@RequestMapping("/free/")
public class FreemarkerController {

    @RequestMapping("test1")
    void test1(String name, int age, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(name);
        //生成静态页面
        //实例化Configuration
        Configuration cg = new Configuration();
        cg.setDefaultEncoding("utf-8");
        //设置编码格式
        cg.setOutputEncoding("utf-8");
        //设置模板所在路径
        cg.setServletContextForTemplateLoading(request.getSession().getServletContext(), "/templates");
        //获取模板
        try {
            Template template = cg.getTemplate("test.ftl");
            template.setEncoding("utf-8");
            template.setOutputEncoding("utf-8");
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", name);
            map.put("age", age);

            PrintWriter writer = response.getWriter();
            template.process(map, writer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("test2")
    void test2(String name, int age, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(name);
        //生成静态页面
        //实例化Configuration
        Configuration cg = new Configuration();
        cg.setDefaultEncoding("utf-8");
        //设置编码格式
        cg.setOutputEncoding("utf-8");
        //设置模板所在路径
        cg.setServletContextForTemplateLoading(request.getSession().getServletContext(), "/templates");
        //获取模板
        try {
            Template template = cg.getTemplate("test.ftl");
            template.setEncoding("utf-8");
            template.setOutputEncoding("utf-8");
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", name);
            map.put("age", age);

            FileWriter w = new FileWriter("D:/templates/cc.html");
            template.process(map, w);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
