package com.zwj.dao;

import com.zwj.entity.SysUserEntity;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface SysUserDao {
    /**
     * 查询一个实体类
     * @param map id
     * @return 用户实体
     */
    SysUserEntity queryObject(Map<String,Object> map);
}
