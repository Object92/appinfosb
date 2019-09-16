package com.bdqn.appInfo.service.impl;

import com.bdqn.appInfo.dao.DevUserMapper;
import com.bdqn.appInfo.exception.BusinessExcpetion;
import com.bdqn.appInfo.pojo.DevUser;
import com.bdqn.appInfo.service.IDevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *@ClassName:DevUserService
 *@Description:开发者业务接口的实现类
 *@Author:lzq
 *@Date: 2019/9/11 11:48
 **/
@Service
@Transactional
public class DevUserService implements IDevUserService {
    @Autowired
    private DevUserMapper devUserMapper;
    @Override
    public DevUser finDevUserById(Long id) throws BusinessExcpetion {
        return devUserMapper.selectByPrimaryKey(id);
    }
}
