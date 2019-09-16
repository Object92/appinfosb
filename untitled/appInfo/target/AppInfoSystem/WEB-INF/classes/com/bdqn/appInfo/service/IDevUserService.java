package com.bdqn.appInfo.service;

import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.pojo.DevUser;

/**
 *@ClassName:DevUser
 *@Description:todo 应用开发者业务接口
 *@Author:lzq
 *@Date: 2019/9/11 11:46
 **/
public interface IDevUserService {

        /**
         * Description:通过ID获取方法
         * param:
         * return:
         * Date: 2019/9/11 11:57
         */
    DevUser finDevUserById(Long id) throws BusinessExcpetion;
}
