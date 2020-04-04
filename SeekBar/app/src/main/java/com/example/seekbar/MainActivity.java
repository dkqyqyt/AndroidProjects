package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 뷰의 주소값을 담을 참조 변수
    SeekBar seek1, seek2;
    TextView text1, text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seek1 = (SeekBar)findViewById(R.id.seekBar);
        seek2 = (SeekBar)findViewById(R.id.seekBar2);
        text1 = (TextView)findViewById(R.id.textView);
        text2 = (TextView)findViewById(R.id.textView2);
    }

    // 1 증가시키는 메소드
    public void btn1Method(View view){
        seek1.incrementProgressBy(1);
        seek2.incrementProgressBy(1);
    }

    // 1 감소시키는 메소드
    public void btn2Method(View view){
        seek1.incrementProgressBy(-1);
        seek2.incrementProgressBy(-1);
    }

    // 세팅하는 메소드
    public void btn3Method(View view){
        seek1.setProgress(8);
        seek2.setProgress(3);
    }

    // 현재 progress를 출력하는 메소드
    public void btn4Method(View view){
        int value1 = seek1.getProgress();
        int value2 = seek2.getProgress();

        text1.setText("seek1 : " + value1);
        text2.setText("seek2 : " + value2);
    }
}
