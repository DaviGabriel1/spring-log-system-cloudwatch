package com.log.log_cloudWatch.entities;

import com.log.log_cloudWatch.enums.TypeLogEnum;

public class Log {
    private long id;
    private String message;
    private TypeLogEnum typeLog;

    public Log(long id, String message, TypeLogEnum typeLog) {
        this.id = id;
        this.message = message;
        this.typeLog = typeLog;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TypeLogEnum getTypeLog() {
        return typeLog;
    }

    public void setTypeLog(TypeLogEnum typeLog) {
        this.typeLog = typeLog;
    }
}
