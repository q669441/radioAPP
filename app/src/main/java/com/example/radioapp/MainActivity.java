package com.example.radioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        TextView textlike =(TextView)findViewById(R.id.textLike);
        RadioGroup fradioGroup = (RadioGroup) findViewById(R.id.fradioGroup);

        int id =fradioGroup.getCheckedRadioButtonId();
        RadioButton selected =(RadioButton)findViewById(id);
textlike.setText("我的最愛是:"+selected.getText());
    }
}
