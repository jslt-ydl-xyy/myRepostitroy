package com.dl.niubike1.mapper;

import com.dl.niubike1.pojo.Bike;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BikeMapper {

    public void save(Bike bike);
}
