package com.jk.dao;

import com.jk.mapper.CarMapper;
import com.jk.pojo.Car;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarDaoTest {

    @Autowired
    private CarMapper carMapper;

    @Test
    public void findCar()
    {
        Car car = carMapper.selectByPrimaryKey(3);
        car.getCarName();
    }

    @Test
    public void insertCar()
    {
        Car car = new Car();
        car.setCarName("大众");
        car.setCarType(2);
        car.setDpratio(20.0);
        car.setPrice(50000.0);
        car.setRemark("123");
        carMapper.insert(car);
    }

    @Test
    public void updateCar()
    {
        Car car = new Car();
        car.setCarId(3);
        car.setCarName("奥迪");
        carMapper.updateByPrimaryKeySelective(car);
    }

    @Test
    public void deleteCar()
    {
        carMapper.deleteByPrimaryKey(4);
    }
}
