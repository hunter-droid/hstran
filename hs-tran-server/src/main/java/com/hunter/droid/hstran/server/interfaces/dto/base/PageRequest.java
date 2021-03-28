package com.hunter.droid.hstran.server.interfaces.dto.base;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/28 8:08 下午
 */
@Data
public class PageRequest extends Request {
    private Integer pageSize;

    private Integer pageIndex;
}
