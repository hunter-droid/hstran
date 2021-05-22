package com.hunter.droid.hstran.server.domin.app.converter;

import com.github.pagehelper.PageInfo;
import com.hunter.droid.hstran.server.domin.app.entity.App;
import com.hunter.droid.hstran.server.domin.app.entity.valueobject.AppLocale;
import com.hunter.droid.hstran.server.domin.app.repository.po.AppLocalePO;
import com.hunter.droid.hstran.server.domin.app.repository.po.AppPO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/28 8:18 下午
 */
@Mapper
public interface AppLocaleDominConverter {
    AppLocaleDominConverter INSTANCE = Mappers.getMapper(AppLocaleDominConverter.class);

    List<AppLocalePO> toAppLocalePOs(List<AppLocale> appLocales);

}
