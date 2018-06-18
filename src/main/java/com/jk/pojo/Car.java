package com.jk.pojo;

import java.util.Date;

public class Car {
    private Integer carId;

    private String carName;

    private Integer carType;

    private Long price;

    private Double dpratio;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public Car(Integer carId, String carName, Integer carType, Long price, Double dpratio, String remark, Date createTime, Date updateTime) {
        this.carId = carId;
        this.carName = carName;
        this.carType = carType;
        this.price = price;
        this.dpratio = dpratio;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Car() {
        super();
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName == null ? null : carName.trim();
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Double getDpratio() {
        return dpratio;
    }

    public void setDpratio(Double dpratio) {
        this.dpratio = dpratio;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}