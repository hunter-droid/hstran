package com.hunter.droid.hstran.server.interfaces.converter;

import com.github.pagehelper.PageInfo;
import com.hunter.droid.hstran.server.domin.app.entity.App;
import com.hunter.droid.hstran.server.interfaces.dto.AppPageInfoResponse;
import com.hunter.droid.hstran.server.interfaces.dto.AppPageListResponse;
import com.hunter.droid.hstran.server.interfaces.dto.CreateAppRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/28 8:02 下午
 */
@Mapper
public interface AppConverter {
    AppConverter INSTANCE = Mappers.getMapper(AppConverter.class);

    App toApp(CreateAppRequest source);

    PageInfo<AppPageInfoResponse> toAppPageListResponse(PageInfo<App> appPageInfo);
}
