package com.example.complexdatafirebaseroom.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.complexdatafirebaseroom.Converters;
import com.example.complexdatafirebaseroom.DAO.DataDao;
import com.example.complexdatafirebaseroom.Data;
import com.example.complexdatafirebaseroom.ItemCoverter;
import com.example.complexdatafirebaseroom.SubsetConverter;

@Database(entities = {Data.class}, version = 2)
@TypeConverters({Converters.class, ItemCoverter.class, SubsetConverter.class})
public abstract class DataDatabase extends RoomDatabase {

    private static final String DATABASE_NAME="data";
    public abstract DataDao dataDao();

    private static volatile DataDatabase instance= null;

    //creating only one instance
    public static DataDatabase getInstance(Context context){
        if (instance==null){
            synchronized (DataDatabase.class){
                if (instance==null){
                    instance= Room.databaseBuilder(context,DataDatabase.class,
                            DATABASE_NAME).fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return instance;
    }
}
