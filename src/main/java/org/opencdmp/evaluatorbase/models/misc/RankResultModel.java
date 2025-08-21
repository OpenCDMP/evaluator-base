package org.opencdmp.evaluatorbase.models.misc;

import java.util.List;

public class RankResultModel {

    private double rank;
    private String details;
    private List<EvaluationResultModel> results;

    public RankResultModel() {}

    public RankResultModel(double rank, String details, List<EvaluationResultModel> results) {
        this.rank = rank;
        this.details = details;
        this.results = results;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<EvaluationResultModel> getResults() {
        return results;
    }

    public void setResults(List<EvaluationResultModel> results) {
        this.results = results;
    }
}
