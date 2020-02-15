package com.dl.niubike1.service;

import com.dl.niubike1.dao.LogRepository;
import com.dl.niubike1.pojo.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogRepository logRepository;

    @Override
    public void save(Log log) {
        logRepository.save(log);
    }
}
