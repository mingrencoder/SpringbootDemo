package com.jk.controller;

import com.jk.properties.CatProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jikai on 2017/11/5.
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private CatProperty catProperty;

    // 组合注解GetMapping
    // RequestParam 获取请求参数的数据
    @GetMapping(value = "/sayparam")
    public String sayidid(@RequestParam(value="id", required = false, defaultValue = "0") Integer myId){
        return "id:" + myId;
    }

    // PathVariable 获取url中的数据
    @RequestMapping(value = "/saypath/{id}", method = RequestMethod.GET)
    public String sayid(@PathVariable("id") Integer myId){

        return "id:" + myId;
    }


    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(){

        return catProperty.getColor() + "," + catProperty.getWeight();
    }

}
