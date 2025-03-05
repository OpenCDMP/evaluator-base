package org.opencdmp.evaluatorbase.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RankType {

    ValueRange((short) 0),
    Selection((short) 1);

    private final Short value;

    RankType(Short value){
        this.value = value;
    }

    @JsonValue
    public Short getValue(){
        return this.value;
    }
}
