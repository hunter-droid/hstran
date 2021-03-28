package com.hunter.droid.hstran.server.interfaces.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/28 8:21 下午
 */
@Data
@AllArgsConstructor
public class AppPageInfoResponse {
    private Integer id;

    private Integer appId;

    private String appName;

    private String description;

    private Date gmtCreate;

    private Date gmtModify;
}
