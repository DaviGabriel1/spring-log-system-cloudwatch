package com.log.log_cloudWatch.interfaces;

import com.log.log_cloudWatch.entities.Log;

public interface ICloudWatchService {
    void sendLogs(Log log);
    Log getLogById(long id);
}
