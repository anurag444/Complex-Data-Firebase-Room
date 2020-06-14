package com.example.complexdatafirebaseroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Items {
    @Expose
    @SerializedName("audio")
    public String audio;
    @Expose
    @SerializedName("image")
    public String image;
    @Expose
    @SerializedName("text")
    public String text;
    @Expose
    @SerializedName("opt_id")
    public int opt_id;
}
