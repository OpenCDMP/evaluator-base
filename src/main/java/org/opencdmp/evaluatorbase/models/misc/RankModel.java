package org.opencdmp.evaluatorbase.models.misc;

import java.util.Map;

public class RankModel {

    private double rank;
    private Map<String, String> messages;
    private String details; // details about how the rank was determined.

    public RankModel() {}

    public RankModel(double rank, Map<String, String> validations) {
        this.rank = rank;
        this.messages = validations;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public Map<String, String> getMessages() {
        return messages;
    }

    public void setMessages(Map<String, String> messages) {
        this.messages = messages;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
