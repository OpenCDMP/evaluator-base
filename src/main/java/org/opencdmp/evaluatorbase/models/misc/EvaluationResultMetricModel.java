package org.opencdmp.evaluatorbase.models.misc;

import java.util.List;

public class EvaluationResultMetricModel {

    private double rank;
    private String metricTitle;
    private String metricDetails;
    private List<EvaluationResultMessageModel> messages;

    public EvaluationResultMetricModel() {}

    public EvaluationResultMetricModel(double rank, String metricTitle, String metricDetails, List<EvaluationResultMessageModel> messages) {
        this.rank = rank;
        this.metricTitle = metricTitle;
        this.metricDetails = metricDetails;
        this.messages = messages;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public String getMetricTitle() {
        return metricTitle;
    }

    public void setMetricTitle(String metricTitle) {
        this.metricTitle = metricTitle;
    }

    public String getMetricDetails() {
        return metricDetails;
    }

    public void setMetricDetails(String metricDetails) {
        this.metricDetails = metricDetails;
    }

    public List<EvaluationResultMessageModel> getMessages() {
        return messages;
    }

    public void setMessages(List<EvaluationResultMessageModel> messages) {
        this.messages = messages;
    }
}
