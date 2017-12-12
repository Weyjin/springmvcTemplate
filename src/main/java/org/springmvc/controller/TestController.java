package org.springmvc.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by Administrator on 2017/10/9.
 */
@Controller
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view=new ModelAndView();
        view.setViewName("test/index");
        return view;
    }
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView view=new ModelAndView();
        view.setViewName("test/list");
        return view;
    }
    @RequestMapping("/test1")
    public ModelAndView test1(){
        ModelAndView view=new ModelAndView();
        Subject subject= SecurityUtils.getSubject();
        if(subject.hasRole("admin")){
            view.setViewName("test/test1");
        }
        view.setViewName("home/login");
        return view;
    }

    @RequestMapping("/test2")
    public ModelAndView test2(){
        ModelAndView view=new ModelAndView();
        view.setViewName("test/list");
        return view;
    }


}
