package com.dl.niubike1.dao;

import com.dl.niubike1.pojo.Bike;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BikeRepository extends MongoRepository<Bike,String> {
}
