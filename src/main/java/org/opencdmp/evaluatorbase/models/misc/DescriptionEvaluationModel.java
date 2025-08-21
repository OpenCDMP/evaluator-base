package org.opencdmp.evaluatorbase.models.misc;

import org.opencdmp.commonmodels.models.description.DescriptionModel;
import org.opencdmp.commonmodels.models.plan.PlanModel;

import java.util.List;

public class DescriptionEvaluationModel {

    private DescriptionModel descriptionModel;

    private List<String> benchmarkIds;


    public DescriptionEvaluationModel() {}

    public DescriptionEvaluationModel(DescriptionModel descriptionModel, List<String> benchmarkIds) {
        this.descriptionModel = descriptionModel;
        this.benchmarkIds = benchmarkIds;
    }

    public DescriptionModel getDescriptionModel() {
        return descriptionModel;
    }

    public void setDescriptionModel(DescriptionModel descriptionModel) {
        this.descriptionModel = descriptionModel;
    }

    public List<String> getBenchmarkIds() {
        return benchmarkIds;
    }

    public void setBenchmarkIds(List<String> benchmarkIds) {
        this.benchmarkIds = benchmarkIds;
    }
}
