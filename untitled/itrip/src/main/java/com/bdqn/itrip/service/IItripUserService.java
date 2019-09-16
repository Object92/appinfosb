package com.bdqn.itrip.service;

import com.bdqn.itrip.pojo.ItripUser;

/**
 *@ClassName:
 *@Description:  爱旅行相关的业务接口
 *@Author:lzq
 *@Date: 2019/9/12 10:28
 **/
public interface IItripUserService {

    /**
     * Description:查找用户通过Id
     * param:
     * return:
     * Date:
     */
    ItripUser findItripUsertById(Long id);
}
