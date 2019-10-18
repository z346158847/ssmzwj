package com.zwj.service.impl;

import com.zwj.dao.SysUserDao;
import com.zwj.entity.SysUserEntity;
import com.zwj.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserDao sysUserDao;


    @Override
    public SysUserEntity queryObject(Map<String, Object> map) {
        return sysUserDao.queryObject(map);
    }
}
