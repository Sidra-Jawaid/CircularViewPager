package com.example.sidrajawaid.circularviewpager;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    HorizontalInfiniteCycleViewPager horizontalInfiniteCycleViewPager;
    private CoverFlowAdapter adapter;
    public static final String TAG="MainActivity";
    private List<Integer> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        horizontalInfiniteCycleViewPager=(HorizontalInfiniteCycleViewPager)findViewById(R.id.cycleviewpager) ;
        setList();
        adapter=new CoverFlowAdapter(list, this);

        horizontalInfiniteCycleViewPager.setAdapter(adapter);

}
    public void setList() {
        list.add(R.drawable.image1);
        list.add(R.drawable.image2);
        list.add(R.drawable.image3);
        list.add(R.drawable.image4);
        list.add(R.drawable.image5);

    }

    }

