package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("onCreate 메서드 호출");
        Log.d("test","onCreate호출");
    }

    @Override
    protected void onStart(){
        super.onStart();

        Log.d("test","onRestart 호출");
    }

    @Override
    protected void onPause(){
        super.onPause();

        Log.d("test","onPause 호출");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Log.d("test","onDestroy 호출");
    }

}
