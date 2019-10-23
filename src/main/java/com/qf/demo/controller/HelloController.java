package com.qf.demo.controller;

import com.qf.demo.config.Resource;
import com.qf.demo.entity.ResultBean;
import com.qf.demo.entity.TUser;
import com.qf.demo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author yu
 * @date 2019/10/21 0021
 */
@Controller
@MapperScan("com.qf.demo.mapper")
@RequestMapping("user")
@Slf4j
public class HelloController {

    @Autowired
    private Resource resource;
    @Autowired
    private IUserService userService;
    @RequestMapping("hello")
    @ResponseBody()
    public String hello(){
        log.error("error...");
        log.info("info...");
        System.out.println(resource.getImages());
        return resource.getEmail();
    }

    @GetMapping("{id}")
    @ResponseBody
    public TUser getUserById(@PathVariable("id")int id){
        System.out.println("查询操作");
        return userService.getUserById(id);
    }

    @PostMapping("add")
    @ResponseBody
    public ResultBean add(@Valid TUser tUser){
        System.out.println(tUser.getId());
        System.out.println(tUser.getUsername());
        return new ResultBean("200","提交");
    }
}
