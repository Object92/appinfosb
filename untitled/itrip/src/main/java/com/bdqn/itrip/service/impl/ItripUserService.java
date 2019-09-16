package com.bdqn.itrip.service.impl;

import com.bdqn.itrip.dao.ItripUserMapper;
import com.bdqn.itrip.pojo.ItripUser;
import com.bdqn.itrip.service.IItripUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *@ClassName:ItripUserService
 *@Description:爱旅行相关的业务接口的业务实现类
 *@Author:lzq
 *@Date: 2019/9/12 10:29
 **/
@Service
@Transactional
public class ItripUserService implements IItripUserService {

    @Autowired
    private ItripUserMapper itripUserMapper;

    @Override
    public ItripUser findItripUsertById(Long id) {
        return itripUserMapper.selectByPrimaryKey(id);
    }
}
