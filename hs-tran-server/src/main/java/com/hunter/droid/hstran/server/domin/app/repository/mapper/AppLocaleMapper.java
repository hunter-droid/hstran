package com.hunter.droid.hstran.server.domin.app.repository.mapper;

import com.hunter.droid.hstran.server.domin.app.repository.po.AppLocalePO;
import com.hunter.droid.hstran.server.domin.app.repository.po.AppPO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AppLocaleMapper {

    @Insert("INSERT INTO app_locale(app_id,locale_id) VALUES(#{appId}, #{localeId})")
    int insert(AppLocalePO record);

    @Insert({
            "<script>",
            "insert into app_locale(app_id, locale_id) values ",
            "<foreach collection='appLocalePOS' item='item' index='index' separator=','>",
            "(#{item.appId}, #{item.localeId})",
            "</foreach>",
            "</script>"
    })
    int insertCollectList(@Param(value="appLocalePOS") List<AppLocalePO> appLocalePOS);

}