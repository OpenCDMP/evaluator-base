package org.opencdmp.evaluatorbase.interfaces;

import org.opencdmp.commonmodels.enums.PluginEntityType;

import java.util.List;

public class BenchmarkConfiguration {

    private String id;
    private String label;
    private List<PluginEntityType> appliesTo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<PluginEntityType> getAppliesTo() {
        return appliesTo;
    }

    public void setAppliesTo(List<PluginEntityType> appliesTo) {
        this.appliesTo = appliesTo;
    }
}
