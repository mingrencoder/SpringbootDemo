package com.jk.exception;

import com.jk.consts.ResultEnum;

/**
 * Created by jikai on 2017/11/6.
 */
public class CatException extends RuntimeException { // spring只对RuntimeException有事物回滚

    private Integer code;

    public CatException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
