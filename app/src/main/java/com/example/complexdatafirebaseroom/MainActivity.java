package com.example.complexdatafirebaseroom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.complexdatafirebaseroom.Repository.Repository;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Repository repository;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        repository=new Repository(getApplication());
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        DocumentReference reference= db.collection("test").document("kw").collection("ca").document("qz");
        reference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                Data pojo=  documentSnapshot.toObject(Data.class);

                assert pojo != null;
                repository.insertAll(pojo);
                Toast.makeText(MainActivity.this, " " + pojo.getTopic_quizs().get(0).getQz_id() , Toast.LENGTH_SHORT).show();
                Log.e("Main", "Msg: "+pojo.getTopic_quizs().get(0).getSubset().get(0).getItems().get(0).getText());
            }
        });




    }
}
