package com.hunter.droid.hstran.server.application.service;

import com.github.pagehelper.PageInfo;
import com.hunter.droid.hstran.server.domin.app.converter.AppDominConverter;
import com.hunter.droid.hstran.server.domin.app.converter.AppLocaleDominConverter;
import com.hunter.droid.hstran.server.domin.app.entity.App;
import com.hunter.droid.hstran.server.domin.app.repository.mapper.AppLocaleMapper;
import com.hunter.droid.hstran.server.domin.app.repository.mapper.AppMapper;
import com.hunter.droid.hstran.server.domin.app.repository.po.AppLocalePO;
import com.hunter.droid.hstran.server.domin.app.repository.po.AppPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/13 7:38 下午
 */
@Service
public class AppService {
    @Autowired
    private AppMapper appMapper;
    @Autowired
    private AppLocaleMapper appLocaleMapper;


    public int add(App app) {
        appMapper.insert(AppDominConverter.INSTANCE.toAppPO(app));
        appLocaleMapper.insertCollectList(AppLocaleDominConverter.INSTANCE.toAppLocalePOs(app.getAppLocales()));
        return 1;
    }

    public PageInfo<App> getList(int pageNum, int pageSize, String keyWord) {

        List<AppPO> applications = appMapper.getList(pageNum, pageSize, keyWord);
        PageInfo<AppPO> applicationPageInfo = new PageInfo<>(applications);
        return AppDominConverter.INSTANCE.toApp(applicationPageInfo);
    }
}
