package com.schoolSecuritySystem.controller;


import com.schoolSecuritySystem.pojo.CarRecord;
import com.schoolSecuritySystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.List;

@Controller
@RequestMapping(value = "/Car")
public class CarController {
    @Autowired
    private CarService carService;

    /**
     *入园车辆记录
     */
    @ResponseBody
    @PostMapping("/carRecord")
    public boolean CarRecord(@RequestBody String carNumber) { return carService.carRecord(carNumber); }

    /**
     *得到所有车辆信息
     */
    @ResponseBody
    @PostMapping("/allCarInfo")
    public List<CarRecord> GetAllCarInfo() { return carService.carInfo(); }

    /**
     *车辆出园记录
     */
    @ResponseBody
    @PostMapping("/carOutRecord")
    public double CarOutRecord(@RequestBody String carNumber) throws ParseException { return carService.carOutRecord(carNumber); }

    /**
     *停车场车位数
     */
    @ResponseBody
    @PostMapping("/surplusParkNumber")
    public int GetSurplusParkNumber() { return carService.surpluspark(); }
}
