package com.pettyfox.nat.gateway.infrastucture.exception;

import com.pettyfox.nat.gateway.infrastucture.basic.BaseEnum;
import lombok.Getter;

/**
 * @author Petty Fox
 */
@Getter
public class DirtyException extends RuntimeException {

    private int code;

    public DirtyException(String message) {
        super(message);
    }

    public <T extends Enum<T>> DirtyException(BaseEnum<T, Integer> baseEnum) {
        super(baseEnum.getName());
    }

    public DirtyException(String message, int code) {
        super(message);
        this.code = code;
    }

}
