package com.hunter.droid.hstran.server.interfaces.dto;

import com.hunter.droid.hstran.server.interfaces.dto.base.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/27 8:15 下午
 */
@Data
@AllArgsConstructor
public class CreateAppRequest extends Request {

    private String appName;

    private Integer appId;

    private String description;

    private List<Integer> localeIds;
}


