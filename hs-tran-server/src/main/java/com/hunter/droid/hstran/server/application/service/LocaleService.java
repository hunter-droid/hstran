package com.hunter.droid.hstran.server.application.service;

import com.hunter.droid.hstran.server.domin.locale.repository.mapper.LocaleMapper;
import com.hunter.droid.hstran.server.domin.locale.repository.po.LocalePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/14 4:52 下午
 */
@Service
public class LocaleService {
    @Autowired
    private LocaleMapper localeMapper;


    public int add(LocalePO localePO){
        return localeMapper.insert(localePO);
    }

    public List<LocalePO> getList(){
        return localeMapper.getList();
    }
}
