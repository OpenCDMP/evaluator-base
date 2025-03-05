package org.opencdmp.evaluatorbase.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum NumberType {
    Decimal(0), // double
    Integer(1);

    private final int value;

    NumberType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return this.value;
    }

    public static NumberType fromValue(int value) {
        for (NumberType type : NumberType.values()) {
            if (type.getValue() == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid value: " + value);
    }
}