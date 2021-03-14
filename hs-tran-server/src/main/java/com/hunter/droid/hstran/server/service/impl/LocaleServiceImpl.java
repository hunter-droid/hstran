package com.hunter.droid.hstran.server.service.impl;

import com.hunter.droid.hstran.server.mapper.LocaleMapper;
import com.hunter.droid.hstran.server.model.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/14 4:52 下午
 */
@Service
public class LocaleServiceImpl {
    @Autowired
    private LocaleMapper localeMapper;


    public int add(Locale locale){
        return localeMapper.insert(locale);
    }

    public List<Locale> getList(){
        return localeMapper.getList();
    }
}
