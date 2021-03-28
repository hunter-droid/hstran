package com.hunter.droid.hstran.server.domin.app.converter;

import com.github.pagehelper.PageInfo;
import com.hunter.droid.hstran.server.domin.app.entity.App;
import com.hunter.droid.hstran.server.domin.app.repository.po.AppPO;
import com.hunter.droid.hstran.server.interfaces.converter.AppConverter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/28 8:18 下午
 */
@Mapper
public interface AppDominConverter {
    AppDominConverter INSTANCE = Mappers.getMapper(AppDominConverter.class);

    PageInfo<App> toApp(PageInfo<AppPO> appPOPageInfo);

}
