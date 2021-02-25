package com.example.calculatorfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import static com.example.calculatorfragment.R.*;
import static com.example.calculatorfragment.R.id.fragment_detail;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        ResultFragment fragment = (ResultFragment)getSupportFragmentManager().findFragmentById(fragment_detail);
        Bundle extras = getIntent().getExtras();
        String value = extras.getString("value");
        if(value !=null && fragment != null && fragment.isInLayout()){
            fragment.setMessage(value);
    }
}}