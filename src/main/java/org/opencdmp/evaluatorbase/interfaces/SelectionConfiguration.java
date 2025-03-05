package org.opencdmp.evaluatorbase.interfaces;

import org.opencdmp.evaluatorbase.enums.SuccessStatus;

import java.util.List;

public class SelectionConfiguration {

    public static class ValueSet {
        private double key;
        private SuccessStatus successStatus;

        public double getKey() {
            return key;
        }

        public void setKey(double key) {
            this.key = key;
        }

        public SuccessStatus getSuccessStatus() {
            return successStatus;
        }

        public void setSuccessStatus(SuccessStatus successStatus) {
            this.successStatus = successStatus;
        }
    }

    private List<ValueSet> valueSetList;

    public List<ValueSet> getValueSetList() {
        return valueSetList;
    }

    public void setValueSetList(List<ValueSet> valueSetList) {
        this.valueSetList = valueSetList;
    }
}
