package com.example.verticalviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    VerticalViewPager viewPager;
    Adapter adapter;
    List<Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        models=new ArrayList<>();
        models.add(new Model(R.drawable.DSA,"Course:DSA\n\nAuthor:Drozek"));
        models.add(new Model(R.drawable.DLD,"Course:DLD\nAuthor:Morris Mano"));
        models.add(new Model(R.drawable.DAA,"Course:DAA\nAuthor:Cormen"));
        models.add(new Model(R.drawable.OS,"Course:OS\nAuthor:Silberschatz"));
        models.add(new Model(R.drawable.DM,"Course:DM\nAuthor:Kenneth H.Rosen"));

        adapter=new Adapter(models,this);

        viewPager=findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

    }
}