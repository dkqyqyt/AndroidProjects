package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 뷰의 주소값을 담을 참조변수
    RadioButton radio3, radio4;
    TextView text1, text2;
    RadioGroup group1, group2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //뷰의 주소값을 얻어온다.
        radio3 = (RadioButton)findViewById(R.id.radioButton3);
        radio4 = (RadioButton)findViewById(R.id.radioButton4);
        text1 = (TextView)findViewById(R.id.textView);
        text2 = (TextView)findViewById(R.id.textView2);
        group1 = (RadioGroup) findViewById(R.id.group1);
        group2 = (RadioGroup) findViewById(R.id.group2);

    }

    public void btn1Method(View view){
        radio3.setChecked(true);
        radio4.setChecked(true);
    }

    public void btn2Method(View view){
        //각 라디오 그룹 내에서 선택되어 있는 라디오 버튼의 id값을 가져온다.
        int id1 = group1.getCheckedRadioButtonId();
        int id2 = group2.getCheckedRadioButtonId();

        switch (id1){
            case R.id.radioButton:
                text2.setText("라디오 버튼 1-1 이 선택되었습니다.");
                break;
            case R.id.radioButton2:
                text2.setText("라디오 버튼 1-2 이 선택되었습니다.");
                break;
            case R.id.radioButton3:
                text2.setText("라디오 버튼 1-3 이 선택되었습니다.");
                break;
        }

        switch (id2){
            case R.id.radioButton4:
                text1.setText("라디오 버튼 2-1 이 선택되었습니다.");
                break;
            case R.id.radioButton5:
                text1.setText("라디오 버튼 2-2 이 선택되었습니다.");
                break;
            case R.id.radioButton6:
                text1.setText("라디오 버튼 2-3 이 선택되었습니다.");
                break;
        }
    }
}
