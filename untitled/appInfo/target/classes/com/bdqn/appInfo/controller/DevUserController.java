package com.bdqn.appInfo.controller;

import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.exception.CommonReturnType;
import com.bdqn.appInfo.exception.EnumBusinessError;
import com.bdqn.appInfo.pojo.DevUser;
import com.bdqn.appInfo.service.IDevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName:DevUserController
 *@Description: TODO 开发者控制器
 *@Author:lzq
 *@Date: 2019/9/11 11:44
 **/
@RestController//相当于@Controller+@ResponseBody
@RequestMapping("/devUser")
public class DevUserController {

    @Autowired
    private IDevUserService iDevUserService;

    @GetMapping("/getDevUser/{id}")
    public CommonReturnType getDevUser(@PathVariable("id") Long id) throws BusinessExcpetion {
        DevUser dev_user =iDevUserService.finDevUserById(id);
        if (dev_user==null){
            throw  new BusinessExcpetion(EnumBusinessError.USER_NOT_EXIST);
        }
        return  CommonReturnType.create(dev_user);
    }
}
