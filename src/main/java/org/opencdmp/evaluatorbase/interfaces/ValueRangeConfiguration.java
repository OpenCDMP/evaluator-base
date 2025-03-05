package org.opencdmp.evaluatorbase.interfaces;

import org.opencdmp.evaluatorbase.enums.NumberType;

public class ValueRangeConfiguration {

    private NumberType numberType;
    private double min;
    private double max;
    private double minPassValue;

    public NumberType getNumberType() {
        return numberType;
    }

    public void setNumberType(NumberType numberType) {
        this.numberType = numberType;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMinPassValue() {
        return minPassValue;
    }

    public void setMinPassValue(double minPassValue) {
        this.minPassValue = minPassValue;
    }
}
