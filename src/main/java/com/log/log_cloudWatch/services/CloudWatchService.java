package com.log.log_cloudWatch.services;

import com.log.log_cloudWatch.entities.Log;
import com.log.log_cloudWatch.interfaces.ICloudWatchService;
import org.springframework.stereotype.Service;

@Service
public class CloudWatchService implements ICloudWatchService {
    @Override
    public void sendLogs(Log log) {

    }

    @Override
    public Log getLogById(long id) {
        return null;
    }
}
