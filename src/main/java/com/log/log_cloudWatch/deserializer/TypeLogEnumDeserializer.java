package com.log.log_cloudWatch.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.log.log_cloudWatch.enums.TypeLogEnum;

import java.io.IOException;

public class TypeLogEnumDeserializer extends JsonDeserializer<TypeLogEnum> {
    @Override
    public TypeLogEnum deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) 
            throws IOException {
        try {
            int index = jsonParser.getIntValue();
            if (index >= 0 && index < TypeLogEnum.values().length) {
                return TypeLogEnum.values()[index];
            }
        } catch (Exception ignored) {
        }
        throw new InvalidFormatException(
            jsonParser,
            "Invalid log type",
            jsonParser.getText(),
            TypeLogEnum.class
        );
    }
}