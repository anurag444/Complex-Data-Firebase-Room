package com.example.complexdatafirebaseroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Subset {
    @Expose
    @SerializedName("items")
    public List<Items> items;
    @Expose
    @SerializedName("correct_opt_id")
    public int correct_opt_id;
    @Expose
    @SerializedName("qs_image_id")
    public String qs_image_id;
    @Expose
    @SerializedName("qs_audio_id")
    public String qs_audio_id;
    @Expose
    @SerializedName("vr_id")
    public String vr_id;
    @Expose
    @SerializedName("part_ans")
    public String part_ans;
    @Expose
    @SerializedName("qs_text")
    public String qs_text;
    @Expose
    @SerializedName("inst_text")
    public String inst_text;
    @Expose
    @SerializedName("qs_id")
    public String qs_id;
    @Expose
    @SerializedName("qz_cat")
    public String qz_cat;
}
