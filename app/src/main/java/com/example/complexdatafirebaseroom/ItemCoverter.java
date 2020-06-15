package com.example.complexdatafirebaseroom;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class ItemCoverter {
    @TypeConverter
    public static List<Data.ItemsEntity> fromString(String value) {
        Type listType = new TypeToken<List<Data.ItemsEntity>>() {}.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String fromArrayList(List<Data.ItemsEntity> list) {
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return json;
    }
}
