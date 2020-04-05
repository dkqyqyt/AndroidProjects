package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // 뷰의 주소값을 담을 참조변수
    ImageView img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 뷰의 주소값을 받아온다.
        img3 = (ImageView)findViewById(R.id.imageView3);
        // 이미지를 세팅한다.
        img3.setImageResource(R.drawable.img_android);
    }
}
