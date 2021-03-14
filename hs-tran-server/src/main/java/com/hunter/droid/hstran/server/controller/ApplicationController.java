package com.hunter.droid.hstran.server.controller;

import com.github.pagehelper.PageInfo;
import com.hunter.droid.hstran.server.mapper.ApplicationMapper;
import com.hunter.droid.hstran.server.model.Application;
import com.hunter.droid.hstran.server.service.impl.ApplicationServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "api", tags = {})
@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    private ApplicationServiceImpl applicationService;

    @ApiOperation(value = "获取app", httpMethod = "GET", notes = "获取appid")
    @RequestMapping(method = RequestMethod.GET)
    public PageInfo<Application> getPageList(@RequestParam Integer pageNum
            , @RequestParam Integer pageSize
            , @RequestParam String keyWord) {
        return applicationService.getList(pageNum, pageSize, keyWord);
    }

}
