package com.dl.niubike1.service;


import com.dl.niubike1.pojo.Bike;

import java.util.List;

public interface BikeServce {

    public void save(Bike bike);

    List<Bike> findBikes();
}
