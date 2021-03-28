package com.hunter.droid.hstran.server.interfaces.controller;

import com.github.pagehelper.PageInfo;
import com.hunter.droid.hstran.server.application.service.AppService;
import com.hunter.droid.hstran.server.domin.app.repository.po.AppPO;
import com.hunter.droid.hstran.server.interfaces.converter.AppConverter;
import com.hunter.droid.hstran.server.interfaces.dto.AppPageInfoResponse;
import com.hunter.droid.hstran.server.interfaces.dto.AppPageListRequest;
import com.hunter.droid.hstran.server.interfaces.dto.AppPageListResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fx.yu
 * @date 2021/3/12 8:42
 */
@Api(value = "api", tags = {})
@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private AppService appService;


    @ApiOperation(value = "获取app", httpMethod = "GET", notes = "获取appid")
    @RequestMapping(method = RequestMethod.GET)
    public AppPageListResponse getPageList(AppPageListRequest request) {
        AppPageListResponse appPageListResponse = new AppPageListResponse(AppConverter.INSTANCE
                .toAppPageListResponse(appService.getList(request.getPageIndex()
                        , request.getPageSize(), request.getKeyword())));
        return appPageListResponse.setRequestId(request.getRequestId()).setSuccess();
    }

}
