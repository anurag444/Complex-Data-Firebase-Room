package com.example.complexdatafirebaseroom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        db.collection("test").document("kw").collection("ca").document("qz")
                .get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @com.google.gson.annotations.Expose
            @com.google.gson.annotations.SerializedName("topic_quizs")
            public List<Data> dataList= new ArrayList<>();
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {

                //printing data from Firestore to Log
                Log.e("Main", documentSnapshot.getData().toString());
            }
        });


    }
}
