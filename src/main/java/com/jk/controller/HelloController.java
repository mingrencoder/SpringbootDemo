package com.jk.controller;

import com.jk.mapper.CarMapper;
import com.jk.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by jikai on 2017/11/5.
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private CarMapper carMapper;

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

        Car car = new Car();
        car.setCarId(1);
        car.setCarName("奔驰");
        car.setCarType(1);
        car.setDpratio(10.0);
        car.setPrice(100000.0);
        car.setRemark("123");
        car.setCreateTime(new Date());
        car.setUpdateTime(new Date());
        carMapper.insertSelective(car);
        return null;
    }

}
