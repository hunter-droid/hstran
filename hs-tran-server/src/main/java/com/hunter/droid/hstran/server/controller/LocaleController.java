package com.hunter.droid.hstran.server.controller;

import com.github.pagehelper.PageInfo;
import com.hunter.droid.hstran.server.model.Application;
import com.hunter.droid.hstran.server.model.Locale;
import com.hunter.droid.hstran.server.service.impl.ApplicationServiceImpl;
import com.hunter.droid.hstran.server.service.impl.LocaleServiceImpl;
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
 * @version 1.0
 * @date 2021/3/14 4:50 下午
 */

@Api(value = "api", tags = {})
@RestController
@RequestMapping("/locale")
public class LocaleController {

    @Autowired
    LocaleServiceImpl localeService;

    @Autowired
    private ApplicationServiceImpl applicationMapper;

    @ApiOperation(value = "添加localse", httpMethod = "POST", notes = "添加localse")
    @RequestMapping(method = RequestMethod.POST)
    public int add(Locale locale) {
        return localeService.add(locale);
    }

    @ApiOperation(value = "获取localse", httpMethod = "GET", notes = "获取localse")
    @RequestMapping(method = RequestMethod.GET)
    public List<Locale> getList() {
        return localeService.getList();
    }

}
