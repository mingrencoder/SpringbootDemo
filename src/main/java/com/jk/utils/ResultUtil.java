package com.jk.utils;

import com.jk.consts.Consts;
import com.jk.domain.Result;

/**
 * Created by jikai on 2017/11/6.
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(Consts.CODE_SUCCESS);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success( ) {
        return success(null);
    }

    public static Result fail(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;

    }
}
