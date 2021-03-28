package com.hunter.droid.hstran.server.interfaces.controller;

import com.hunter.droid.hstran.server.domin.locale.repository.po.LocalePO;
import com.hunter.droid.hstran.server.application.service.LocaleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    LocaleService localeService;

    @ApiOperation(value = "添加locale", httpMethod = "POST", notes = "添加localse")
    @RequestMapping(method = RequestMethod.POST)
    public int add(LocalePO localePO) {
        return localeService.add(localePO);
    }

    @ApiOperation(value = "获取locale", httpMethod = "GET", notes = "获取localse")
    @RequestMapping(method = RequestMethod.GET)
    public List<LocalePO> getList() {
        return localeService.getList();
    }

}
