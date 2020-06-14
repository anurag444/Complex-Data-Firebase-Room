package com.example.complexdatafirebaseroom;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@Entity(tableName = "data_table")
public class Data {


//    @Expose
//    @SerializedName("topic_quizs")
//    private List<Topic_quizsEntity> topic_quizs;
    @PrimaryKey
    @NonNull
    int id;
//
//    public List<Topic_quizsEntity> getTopic_quizs() {
//        return topic_quizs;
//    }


    public static class Topic_quizsEntity {
        @Expose
        @SerializedName("subset")
        private List<SubsetEntity> subset;
        @Expose
        @SerializedName("qz_id")
        private String qz_id;

        public List<SubsetEntity> getSubset() {
            return subset;
        }

        public String getQz_id() {
            return qz_id;
        }
    }

    public static class SubsetEntity {
        @Expose
        @SerializedName("items")
        private List<ItemsEntity> items;
        @Expose
        @SerializedName("correct_opt_id")
        private int correct_opt_id;
        @Expose
        @SerializedName("qs_image_id")
        private String qs_image_id;
        @Expose
        @SerializedName("qs_audio_id")
        private String qs_audio_id;
        @Expose
        @SerializedName("vr_id")
        private String vr_id;
        @Expose
        @SerializedName("part_ans")
        private String part_ans;
        @Expose
        @SerializedName("qs_text")
        private String qs_text;
        @Expose
        @SerializedName("inst_text")
        private String inst_text;
        @Expose
        @SerializedName("qs_id")
        private String qs_id;
        @Expose
        @SerializedName("qz_cat")
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
        @Expose
        @SerializedName("audio")
        private String audio;
        @Expose
        @SerializedName("image")
        private String image;
        @Expose
        @SerializedName("text")
        private String text;
        @Expose
        @SerializedName("opt_id")
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
