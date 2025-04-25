package com.log.log_cloudWatch.controller;

import com.log.log_cloudWatch.dto.CreateLogDto;
import com.log.log_cloudWatch.entities.Log;
import com.log.log_cloudWatch.enums.TypeLogEnum;
import com.log.log_cloudWatch.interfaces.ICloudWatchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/logs")
public class LogController {
    private final AtomicLong counter = new AtomicLong();

    private final ICloudWatchService cloudWatchService;

    public LogController(ICloudWatchService cloudWatchService){
        this.cloudWatchService = cloudWatchService;
    }

    @GetMapping("/get-log")
    public Log getLog(@RequestParam(value = "id", required = true) long id){
        return new Log(id, "mock log", TypeLogEnum.INFO);
    }

    @GetMapping
    public String health() {
        return "endpoint health";
    }

    @PostMapping
    public ResponseEntity<Log> addLog(@RequestBody CreateLogDto log) {
        return ResponseEntity.ok(new Log(counter.incrementAndGet(), log.message, log.typeLog));
    }
}