package com.bdqn.appInfo.dao;

import com.bdqn.appInfo.pojo.BackUser;

public interface BackUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BackUser record);

    int insertSelective(BackUser record);

    BackUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BackUser record);

    int updateByPrimaryKey(BackUser record);
}