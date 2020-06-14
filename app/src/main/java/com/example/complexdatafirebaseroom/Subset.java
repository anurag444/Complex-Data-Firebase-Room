package com.example.complexdatafirebaseroom;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Subset {

    private List<Items> items;
    private int correct_opt_id;
    private String qs_image_id;
    private String qs_audio_id;
    private String vr_id;
    private String part_ans;
    private String qs_text;
    private String inst_text;
    private String qs_id;
    private String qz_cat;

    public Subset() {}

    public Subset(List<Items> items, int correct_opt_id, String qs_image_id, String qs_audio_id, String vr_id, String part_ans, String qs_text, String inst_text, String qs_id, String qz_cat) {
        this.items = items;
        this.correct_opt_id = correct_opt_id;
        this.qs_image_id = qs_image_id;
        this.qs_audio_id = qs_audio_id;
        this.vr_id = vr_id;
        this.part_ans = part_ans;
        this.qs_text = qs_text;
        this.inst_text = inst_text;
        this.qs_id = qs_id;
        this.qz_cat = qz_cat;
    }


    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public int getCorrect_opt_id() {
        return correct_opt_id;
    }

    public void setCorrect_opt_id(int correct_opt_id) {
        this.correct_opt_id = correct_opt_id;
    }

    public String getQs_image_id() {
        return qs_image_id;
    }

    public void setQs_image_id(String qs_image_id) {
        this.qs_image_id = qs_image_id;
    }

    public String getQs_audio_id() {
        return qs_audio_id;
    }

    public void setQs_audio_id(String qs_audio_id) {
        this.qs_audio_id = qs_audio_id;
    }

    public String getVr_id() {
        return vr_id;
    }

    public void setVr_id(String vr_id) {
        this.vr_id = vr_id;
    }

    public String getPart_ans() {
        return part_ans;
    }

    public void setPart_ans(String part_ans) {
        this.part_ans = part_ans;
    }

    public String getQs_text() {
        return qs_text;
    }

    public void setQs_text(String qs_text) {
        this.qs_text = qs_text;
    }

    public String getInst_text() {
        return inst_text;
    }

    public void setInst_text(String inst_text) {
        this.inst_text = inst_text;
    }

    public String getQs_id() {
        return qs_id;
    }

    public void setQs_id(String qs_id) {
        this.qs_id = qs_id;
    }

    public String getQz_cat() {
        return qz_cat;
    }

    public void setQz_cat(String qz_cat) {
        this.qz_cat = qz_cat;
    }
}
