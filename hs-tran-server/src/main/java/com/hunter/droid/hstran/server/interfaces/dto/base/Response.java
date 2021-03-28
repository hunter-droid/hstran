package com.hunter.droid.hstran.server.interfaces.dto.base;

import lombok.Data;

/**
 * @author fx.yu
 * @version 1.0
 * @date 2021/3/27 10:41 下午
 */
@Data
public class Response<R> {
    private String requestId;

    private String responseCode;

    private String responseMsg;

    public R setRequestId(String requestId) {
        this.requestId = requestId;
        return (R) this;
    }

    public R setSuccess() {
        this.responseCode = "20000";
        this.responseMsg = "ok";
        return (R) this;
    }

    public R setError(String responseCode, String responseMsg) {
        this.responseCode = responseCode;
        this.responseMsg = responseMsg;
        return (R) this;
    }
}
