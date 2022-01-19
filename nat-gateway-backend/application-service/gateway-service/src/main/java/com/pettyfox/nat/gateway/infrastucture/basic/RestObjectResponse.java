package com.pettyfox.nat.gateway.infrastucture.basic;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * RestFul对象响应
 *
 * @param <T>
 * @author Petty Fox
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class RestObjectResponse<T> {
    /**
     * 公共响应码
     */
    private int code;
    private T data;
    private String msg;
    private String errmsg;

    public static <T> RestObjectResponse<T> ok(T data) {
        RestObjectResponse<T> ok = new RestObjectResponse<>();
        ok.setData(data);
        ok.setCode(RestObjectResponseCode.API_OK);
        return ok;
    }

    public static <T> RestObjectResponse<T> err(Integer code, String message) {
        RestObjectResponse<T> err = new RestObjectResponse<>();
        err.setCode(code);
        err.setErrmsg(message);
        return err;
    }

    public static <T> RestObjectResponse<T> err(String message) {
        RestObjectResponse<T> err = new RestObjectResponse<>();
        err.setCode(RestObjectResponseCode.API_ERROR);
        err.setErrmsg(message);
        return err;
    }

    public static <T> RestObjectResponse<T> err(Exception e) {
        RestObjectResponse<T> err = new RestObjectResponse<>();
        err.setCode(RestObjectResponseCode.API_ERROR);
        err.setErrmsg(e.getMessage());
        log.warn("api exception:{}", err.getErrmsg());
        return err;
    }

    public String toJson() {
        return JSON.toJSONString(this);
    }
}
