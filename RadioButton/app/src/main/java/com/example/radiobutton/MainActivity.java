package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    // 뷰의 주소값을 담을 참조변수
    RadioButton radio3, radio4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //뷰의 주소값을 얻어온다.
        radio3 = (RadioButton)findViewById(R.id.radioButton3);
        radio4 = (RadioButton)findViewById(R.id.radioButton4);
    }

    public void btn1Method(View view){
        radio3.setChecked(true);
        radio4.setChecked(true);
    }
}
