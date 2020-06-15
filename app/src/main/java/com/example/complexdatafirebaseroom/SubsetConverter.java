package com.example.complexdatafirebaseroom;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class SubsetConverter {
    @TypeConverter
    public static List<Data.SubsetEntity> fromString(String value) {
        Type listType = new TypeToken<List<Data.SubsetEntity>>() {}.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String fromArrayList(List<Data.SubsetEntity> list) {
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return json;
    }
}
