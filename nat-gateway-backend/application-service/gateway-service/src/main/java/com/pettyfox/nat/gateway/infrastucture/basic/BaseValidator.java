package com.pettyfox.nat.gateway.infrastucture.basic;


import com.pettyfox.nat.gateway.infrastucture.exception.DirtyException;

import java.io.Serializable;

/**
 * 基础验证接口
 *
 * @author Petty Fox
 */
public interface BaseValidator extends Serializable {

    /**
     * 基础验证接口
     *
     * @throws DirtyException 通用异常
     */
    default void validator() throws DirtyException {

    }
}
