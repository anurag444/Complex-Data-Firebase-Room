package com.example.complexdatafirebaseroom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
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

        DocumentReference reference= db.collection("test").document("kw").collection("ca").document("qz");
        reference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                Topic_quizs topic_quizs= (Topic_quizs) documentSnapshot.toObject(Topic_quizs.class);

                assert topic_quizs != null;
                Toast.makeText(MainActivity.this, " " + topic_quizs.getQz_id() , Toast.LENGTH_SHORT).show();
            }
        });



    }
}
