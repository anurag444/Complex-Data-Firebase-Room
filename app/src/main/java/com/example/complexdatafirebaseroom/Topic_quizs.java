package com.example.complexdatafirebaseroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Topic_quizs {

    private List<Subset> subset;
    private String qz_id;

    public Topic_quizs() {}

    public Topic_quizs(List<Subset> subset, String qz_id) {
        this.subset = subset;
        this.qz_id = qz_id;
    }

    public List<Subset> getSubset() {
        return subset;
    }

    public void setSubset(List<Subset> subset) {
        this.subset = subset;
    }

    public String getQz_id() {
        return qz_id;
    }

    public void setQz_id(String qz_id) {
        this.qz_id = qz_id;
    }
}
