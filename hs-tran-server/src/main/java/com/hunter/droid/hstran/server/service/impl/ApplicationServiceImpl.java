package com.hunter.droid.hstran.server.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hunter.droid.hstran.server.mapper.ApplicationMapper;
import com.hunter.droid.hstran.server.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/13 7:38 下午
 */
@Service
public class ApplicationServiceImpl {
    @Autowired
    private ApplicationMapper applicationMapper;


    public PageInfo<Application> getList(int pageNum, int pageSize,String keyWord) {

        List<Application> applications = applicationMapper.getList(pageNum,pageSize,keyWord);
        PageInfo<Application> applicationPageInfo = new PageInfo<>(applications);

        return applicationPageInfo;
    }
}
