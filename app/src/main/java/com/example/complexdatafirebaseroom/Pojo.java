package com.example.complexdatafirebaseroom;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pojo {


    private List<Topic_quizsEntity> topic_quizs;
    public List<Topic_quizsEntity> getTopic_quizs() {
        return topic_quizs;
    }


    public static class Topic_quizsEntity {

        private List<SubsetEntity> subset;
        private String qz_id;

        public List<SubsetEntity> getSubset() {
            return subset;
        }

        public String getQz_id() {
            return qz_id;
        }
    }

    public static class SubsetEntity {

        private List<ItemsEntity> items;
        private int correct_opt_id;
        private String qs_image_id;
        private String qs_audio_id;
        private String vr_id;
        private String part_ans;
        private String qs_text;
        private String inst_text;
        private String qs_id;
        private String qz_cat;

        public List<ItemsEntity> getItems() {
            return items;
        }

        public int getCorrect_opt_id() {
            return correct_opt_id;
        }

        public String getQs_image_id() {
            return qs_image_id;
        }

        public String getQs_audio_id() {
            return qs_audio_id;
        }

        public String getVr_id() {
            return vr_id;
        }

        public String getPart_ans() {
            return part_ans;
        }

        public String getQs_text() {
            return qs_text;
        }

        public String getInst_text() {
            return inst_text;
        }

        public String getQs_id() {
            return qs_id;
        }

        public String getQz_cat() {
            return qz_cat;
        }
    }

    public static class ItemsEntity {
        private String audio;
        private String image;
        private String text;
        private int opt_id;

        public String getAudio() {
            return audio;
        }

        public String getImage() {
            return image;
        }

        public String getText() {
            return text;
        }

        public int getOpt_id() {
            return opt_id;
        }
    }



}
