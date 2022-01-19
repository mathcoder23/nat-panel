package com.pettyfox.nat.gateway.infrastucture.basic;


/**
 * @param <E> 枚举类型本身
 * @param <T> 枚举value类型
 * @author Petty Fox
 */
public interface BaseEnum<E extends Enum<E>, T> {
    /**
     * 获取枚举的值
     *
     * @return 枚举的值
     */
    T getValue();

    /**
     * 获取枚举名称
     *
     * @return 枚举名称
     */
    String getName();
}