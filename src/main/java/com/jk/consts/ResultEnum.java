package com.jk.consts;

/**
 * Created by jikai on 2017/11/6.
 */
public enum ResultEnum {

    UNKONWN_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    THIN(100, "瘦猫"),
    FAT(101, "胖猫"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
