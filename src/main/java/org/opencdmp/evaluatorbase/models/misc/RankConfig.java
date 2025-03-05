package org.opencdmp.evaluatorbase.models.misc;

import org.opencdmp.evaluatorbase.enums.RankType;
import org.opencdmp.evaluatorbase.interfaces.SelectionConfiguration;
import org.opencdmp.evaluatorbase.interfaces.ValueRangeConfiguration;

public class RankConfig {

    private RankType rankType; // Value Range or Selection (0 or 1)
    private ValueRangeConfiguration valueRangeConfiguration;
    private SelectionConfiguration selectionConfiguration;

    public RankType getRankType() {
        return rankType;
    }

    public void setRankType(RankType rankType) {
        this.rankType = rankType;
    }

    public ValueRangeConfiguration getValueRangeConfiguration() {
        return valueRangeConfiguration;
    }

    public void setValueRangeConfiguration(ValueRangeConfiguration valueRangeConfiguration) {
        this.valueRangeConfiguration = valueRangeConfiguration;
    }

    public SelectionConfiguration getSelectionConfiguration() {
        return selectionConfiguration;
    }

    public void setSelectionConfiguration(SelectionConfiguration selectionConfiguration) {
        this.selectionConfiguration = selectionConfiguration;
    }
}
