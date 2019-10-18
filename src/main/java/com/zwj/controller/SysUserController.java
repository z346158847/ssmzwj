package com.zwj.controller;

import com.zwj.entity.SysUserEntity;
import com.zwj.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController("")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    private final static Logger logger = LoggerFactory.getLogger(SysUserController.class);

    @ResponseBody
    @RequestMapping(value = "queryObjectAsJson")
    public SysUserEntity queryObjectAsJson(String id) {

        Map<String, Object> map = new HashMap<>();
        map.put("id", 1L);
        return sysUserService.queryObject(map);
    }


    @RequestMapping(value = "queryObjectAsJsp")
    public ModelAndView queryObjectAsJsp(String id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1L);
        List<SysUserEntity> list = new ArrayList<>();
        SysUserEntity sysUserEntity = sysUserService.queryObject(map);
        map.put("id", 2L);
        SysUserEntity sysUserEntity1 = sysUserService.queryObject(map);
        list.add(sysUserEntity);
        list.add(sysUserEntity1);
        System.out.println(sysUserEntity.toString());
        ModelAndView model = new ModelAndView();
        model.addObject("list", list);
        model.setViewName("index");


        logger.info("成功=>{}", list);

        return model;
    }



}
