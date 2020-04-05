package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 뷰의 주소값을 담을 참조변수
    EditText edit1;
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText)findViewById(R.id.editText2);
        text1 = (TextView)findViewById(R.id.textView);
    }

    public void btn1Method(View view){
        edit1.setText("새롭게 설정한 문자열");
    }
}
