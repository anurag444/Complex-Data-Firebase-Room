package com.example.complexdatafirebaseroom.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.complexdatafirebaseroom.Data;
import com.example.complexdatafirebaseroom.Topic_quizs;

import java.util.List;

@Dao
public interface DataDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<Data> data);

    @Query("SELECT * from data_table")
    LiveData<List<Data>> getData();


    @Query("DELETE FROM data_table")
    void deleteAll();

    @Insert
    void insertAll(Data... data);
}
