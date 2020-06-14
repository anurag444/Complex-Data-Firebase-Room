package com.example.complexdatafirebaseroom.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.complexdatafirebaseroom.DAO.DataDao;
import com.example.complexdatafirebaseroom.Data;
import com.example.complexdatafirebaseroom.Database.DataDatabase;

import java.util.List;

public class Repository {
    private DataDatabase dataDatabase;
    private LiveData<List<Data>> getAllData;


    public Repository(Application application){
        dataDatabase=DataDatabase.getInstance(application);
        getAllData=dataDatabase.dataDao().getData();
    }

    public void insert(List<Data> dataList){
        new insertAsync(dataDatabase).execute(dataList);
    }


    static class insertAsync extends AsyncTask<List<Data>,Void,Void> {

        private DataDao dataDao;

        insertAsync(DataDatabase dataDatabase){
            dataDao= dataDatabase.dataDao();
        }


        @Override
        protected Void doInBackground(List<Data>... lists) {
            dataDao.insert(lists[0]);
            return null;
        }
    }
}

