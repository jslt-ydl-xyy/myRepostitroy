package com.dl.niubike1.dao;

import com.dl.niubike1.pojo.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log,String> {
}
