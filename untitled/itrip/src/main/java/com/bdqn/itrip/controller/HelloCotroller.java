package com.bdqn.itrip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName:
 *@Description: 测试启动
 *@Author:lzq
 *@Date: 2019/9/11 12:26
 **/
@RestController
@RequestMapping("/hello")
public class HelloCotroller {

    @GetMapping("/index")
    private String index(){
        return "hello 王金蛋";
    }
}
