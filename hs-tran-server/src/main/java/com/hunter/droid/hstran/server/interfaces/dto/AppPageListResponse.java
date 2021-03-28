package com.hunter.droid.hstran.server.interfaces.dto;

import com.github.pagehelper.PageInfo;
import com.hunter.droid.hstran.server.interfaces.dto.base.Response;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/28 8:07 下午
 */
@Data
@AllArgsConstructor
public class AppPageListResponse extends Response<AppPageListResponse> {
    protected PageInfo<AppPageInfoResponse> appPageInfo;
}
