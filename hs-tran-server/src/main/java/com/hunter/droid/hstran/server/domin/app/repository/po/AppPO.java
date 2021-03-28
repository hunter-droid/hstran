package com.hunter.droid.hstran.server.domin.app.repository.po;

import lombok.Data;

import java.util.Date;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/27 9:21 下午
 */
@Data
public class AppPO {
    private Integer id;

    private Integer appId;

    private String appName;

    private String description;

    private Date gmtCreate;

    private Date gmtModify;
}
