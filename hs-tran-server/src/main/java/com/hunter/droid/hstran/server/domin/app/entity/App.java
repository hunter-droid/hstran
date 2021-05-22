package com.hunter.droid.hstran.server.domin.app.entity;

import com.hunter.droid.hstran.server.domin.app.entity.valueobject.AppLocale;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/27 10:48 下午
 */
@Data
public class App {
    private Integer id;

    private Integer appId;

    private String appName;

    private String description;

    private Date gmtCreate;

    private Date gmtModify;

    private List<AppLocale> appLocales;

    public App setAppLocales(List<Integer> locales) {
        this.appLocales = locales.stream().map(o -> {
            AppLocale appLocale = new AppLocale();
            appLocale.setAppId(appId);
            appLocale.setLocaleId(o);
            return appLocale;
        }).collect(Collectors.toList());
        return this;
    }

}
