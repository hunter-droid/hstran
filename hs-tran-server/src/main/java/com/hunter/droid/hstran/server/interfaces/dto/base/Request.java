package com.hunter.droid.hstran.server.interfaces.dto.base;

import lombok.Data;

import java.util.Map;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/27 10:41 下午
 */
@Data
public class Request {

    private String requestId;

    private Map<String,String> headers;

}
