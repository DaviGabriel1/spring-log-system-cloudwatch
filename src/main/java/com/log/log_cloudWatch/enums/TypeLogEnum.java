package com.log.log_cloudWatch.enums;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.log.log_cloudWatch.deserializer.TypeLogEnumDeserializer;

@JsonDeserialize(using = TypeLogEnumDeserializer.class)
public enum TypeLogEnum {
    ERROR(0), WARNING(1), SUCCESS(2), INFO(3);

    private final int code;

    public int getCode() {
        return code;
    }

    private TypeLogEnum(int code) {
        this.code = code;
    }
}
