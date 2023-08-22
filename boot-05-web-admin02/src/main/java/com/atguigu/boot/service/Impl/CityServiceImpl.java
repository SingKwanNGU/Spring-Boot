package com.atguigu.boot.service.Impl;

import com.atguigu.boot.bean.City;
import com.atguigu.boot.mapper.CityMapper;
import com.atguigu.boot.service.CityService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @projectName: boot-05-web-admin02
 * @package: com.atguigu.boot.service
 * @className: CityService
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/22 23:36
 * @version: 1.0
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityMapper cityMapper;

    Counter counter;

    public CityServiceImpl(MeterRegistry meterRegistry){
        counter = meterRegistry.counter("cityService.saveCity.count");
    }

    public City getCityById(Integer id){
        counter.increment();
        return cityMapper.getCityById(id);
    }

    public void saveCity(City city){
        cityMapper.insert(city);
    }
}
