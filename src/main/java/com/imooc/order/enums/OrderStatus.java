package com.imooc.order.enums;

import lombok.Getter;

@Getter
public enum OrderStatus {
    NEW(0, "在架"),
    FINISHED(1, "下架"),
    CANCEL(2,"取消"),
    ;

    private Integer code;

    private String message;

    OrderStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
