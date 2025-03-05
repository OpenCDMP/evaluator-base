package org.opencdmp.evaluatorbase.enums;

public enum SuccessStatus {

    Fail(0),
    Pass(1);

    private final int value;

    SuccessStatus(int value) {
        this.value = value;
    }
}
