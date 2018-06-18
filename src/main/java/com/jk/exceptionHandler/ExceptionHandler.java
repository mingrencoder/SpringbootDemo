package com.jk.exceptionHandler;

import com.jk.domain.Result;
import com.jk.exception.CatException;
import com.jk.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jikai on 2017/11/6.
 */
@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if(e instanceof CatException) {
            CatException catException = (CatException) e;
            return ResultUtil.fail(catException.getCode(), catException.getMessage());
        } else {
            return ResultUtil.fail(-1, e.getMessage());
        }
    }
}
