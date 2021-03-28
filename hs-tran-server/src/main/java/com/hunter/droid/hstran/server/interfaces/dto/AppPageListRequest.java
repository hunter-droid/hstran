package com.hunter.droid.hstran.server.interfaces.dto;

import com.hunter.droid.hstran.server.interfaces.dto.base.PageRequest;
import lombok.Data;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/28 8:06 下午
 */
@Data
public class AppPageListRequest extends PageRequest {
   private String keyword;
}
