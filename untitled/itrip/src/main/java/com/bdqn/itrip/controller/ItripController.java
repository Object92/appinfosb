package com.bdqn.itrip.controller;

import com.bdqn.itrip.exception.BusinessExcpetion;
import com.bdqn.itrip.exception.CommonReturnType;
import com.bdqn.itrip.exception.EnumBusinessError;
import com.bdqn.itrip.pojo.ItripUser;
import com.bdqn.itrip.service.IItripUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *@ClassName:爱旅行用户控制器
 *@Description:
 *@Author:lzq
 *@Date: 2019/9/12 10:25
 **/
@Controller
@RequestMapping("/itripUser")
public class ItripController {

    @Autowired
    private IItripUserService iItripUserService;

    /**
     * Description:获取某个用户信息
     * param:
     * return:
     * Date:
     * @return
     */
    @GetMapping("/getItripUserById/{id}")
    @ResponseBody
    public CommonReturnType getItripUserById(@PathVariable("id") Long id) throws BusinessExcpetion {
        ItripUser itripUser=iItripUserService.findItripUsertById(id);
        if(itripUser==null){
            throw  new BusinessExcpetion(EnumBusinessError.USER_NOT_EXIST);
        }
        return CommonReturnType.create(itripUser);
    }


    /**
     * Description:TODO 跳转到index.html
     * param:
     * return:
     * Date:
     */
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("username","张三");
        return "index";
    }
}
