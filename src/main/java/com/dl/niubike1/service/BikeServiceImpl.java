package com.dl.niubike1.service;

import com.dl.niubike1.dao.BikeRepository;
import com.dl.niubike1.mapper.BikeMapper;
import com.dl.niubike1.pojo.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BikeServiceImpl implements BikeServce {

    @Autowired
    private BikeMapper bikeMapper;

    @Autowired
    private BikeRepository bikeRepository;

    @Override
    public void save(Bike bike) {
//        bike.setId(bike.getQrCode());
//        bikeMapper.save(bike);
        bikeRepository.save(bike);
    }

    @Override
    public List<Bike> findBikes() {
        return bikeRepository.findAll();
    }
}
