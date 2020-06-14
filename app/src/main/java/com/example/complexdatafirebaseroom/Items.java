package com.example.complexdatafirebaseroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Items {
    private String audio;
    private String image;
    private String text;
    private int opt_id;

    public Items() {}

    public Items(String audio, String image, String text, int opt_id) {
        this.audio = audio;
        this.image = image;
        this.text = text;
        this.opt_id = opt_id;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getOpt_id() {
        return opt_id;
    }

    public void setOpt_id(int opt_id) {
        this.opt_id = opt_id;
    }
}
