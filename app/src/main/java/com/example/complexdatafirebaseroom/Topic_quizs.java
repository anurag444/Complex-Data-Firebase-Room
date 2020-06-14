package com.example.complexdatafirebaseroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Topic_quizs {
    @Expose
    @SerializedName("subset")
    public List<Subset> subset;
    @Expose
    @SerializedName("qz_id")
    public String qz_id;
}
