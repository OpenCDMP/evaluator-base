package org.opencdmp.evaluatorbase.models.misc;

import java.util.List;

public class EvaluationResultModel {

    private double rank;
    private String benchmarkTitle;
    private String benchmarkDetails;
    private List<EvaluationResultMetricModel> metrics;

    public EvaluationResultModel() {}

    public EvaluationResultModel(double rank, String benchmarkTitle, String benchmarkDetails, List<EvaluationResultMetricModel> metrics) {
        this.rank = rank;
        this.benchmarkTitle = benchmarkTitle;
        this.benchmarkDetails = benchmarkDetails;
        this.metrics = metrics;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public String getBenchmarkTitle() {
        return benchmarkTitle;
    }

    public void setBenchmarkTitle(String benchmarkTitle) {
        this.benchmarkTitle = benchmarkTitle;
    }

    public String getBenchmarkDetails() {
        return benchmarkDetails;
    }

    public void setBenchmarkDetails(String benchmarkDetails) {
        this.benchmarkDetails = benchmarkDetails;
    }

    public List<EvaluationResultMetricModel> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<EvaluationResultMetricModel> metrics) {
        this.metrics = metrics;
    }
}
