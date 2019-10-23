package com.qf.demo.controller;

import com.qf.demo.entity.TUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yu
 * @date 2019/10/21 0021
 */
@Controller
@RequestMapping("page")
@Slf4j

public class PageController {

    @GetMapping("hello")
    public String hello(Model model){
        log.info("你好[{}],你是第[{}]个登录网址的用户","huangguizhao","1");
        int i=1/0;
        model.addAttribute("username","yu");
        model.addAttribute("user",new TUser(2,"yu","123"));
        List<TUser> list=new ArrayList<>();
        list.add(new TUser(1,"yu","123"));
        list.add(new TUser(3,"yu","123"));
        model.addAttribute("list",list);
        model.addAttribute("now",new Date());
        return "hello";
    }
}
