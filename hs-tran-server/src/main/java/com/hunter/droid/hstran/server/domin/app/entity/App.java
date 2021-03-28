package com.hunter.droid.hstran.server.domin.app.entity;

import lombok.Data;

import java.util.Date;

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

    public void create(){

    }

}
