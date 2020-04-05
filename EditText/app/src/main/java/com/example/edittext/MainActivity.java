package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
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

        EnterListener listener = new EnterListener();
        edit1.setOnEditorActionListener(listener);
    }

    public void btn1Method(View view){
        edit1.setText("새롭게 설정한 문자열");
    }

    public void btn2Method(View view){
        String str = edit1.getText().toString();
        text1.setText("입력한 문자열 : " + str);
    }

    class EnterListener implements TextView.OnEditorActionListener{
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            String str = v.getText().toString();

            text1.setText("입력한 문자열 : " + str);

            return true;
        }
    }

}
