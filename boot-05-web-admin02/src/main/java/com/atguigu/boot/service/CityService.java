package com.atguigu.boot.service;

import com.atguigu.boot.bean.City;

public interface CityService {
    public City getCityById(Integer id);

    public void saveCity(City city);
}
