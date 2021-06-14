package com.example.customlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv1;

    int image [] = {R.drawable.hbomax, R.drawable.disneyplus, R.drawable.amazonprime, R.drawable.netflix, R.drawable.sonyliv};
    String []name = {"HBOMax ", "Disneyplus ", "Amazon Prime ", "Netflix ", "SonylIV "};

    //Images and other things

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1=findViewById(R.id.lv1);
        MyAdapter myAdapter=new MyAdapter(MainActivity.this, image, name);
        lv1.setAdapter(myAdapter);






    }



}
