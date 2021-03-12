package com.hunter.droid.hstran.server.controller;

import com.hunter.droid.hstran.server.mapper.ApplicationMapper;
import com.hunter.droid.hstran.server.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fx.yu
 * @date 2021/3/12 8:42
 */

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    private ApplicationMapper applicationMapper;

    @RequestMapping(method = RequestMethod.GET)
    public List<Application> get(@RequestParam Integer id){
        return applicationMapper.getList();
    }

}
