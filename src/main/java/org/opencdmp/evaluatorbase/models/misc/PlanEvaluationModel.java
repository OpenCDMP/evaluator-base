package org.opencdmp.evaluatorbase.models.misc;

import org.opencdmp.commonmodels.models.plan.PlanModel;

import java.util.List;

public class PlanEvaluationModel {

    private PlanModel planModel;

    private List<String> benchmarkIds;


    public PlanEvaluationModel() {}

    public PlanEvaluationModel(PlanModel planModel, List<String> benchmarkIds) {
        this.planModel = planModel;
        this.benchmarkIds = benchmarkIds;
    }

    public PlanModel getPlanModel() {
        return planModel;
    }

    public void setPlanModel(PlanModel planModel) {
        this.planModel = planModel;
    }

    public List<String> getBenchmarkIds() {
        return benchmarkIds;
    }

    public void setBenchmarkIds(List<String> benchmarkIds) {
        this.benchmarkIds = benchmarkIds;
    }
}
