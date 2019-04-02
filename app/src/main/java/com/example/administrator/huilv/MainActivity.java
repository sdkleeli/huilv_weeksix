package com.example.administrator.huilv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText rmb;
    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rmb = (EditText)findViewById(R.id.rmb);
        show = (TextView)findViewById(R.id.showOut);
    }
    public void onClick(View btn){
        String str = rmb.getText().toString();
        float r = 0;
        if(str.length()>0) {
            r = Float.parseFloat(str);
        }else{
            Toast.makeText(this,"请输入金额",Toast.LENGTH_SHORT).show();
        }
        float val=0;
        if (btn.getId() == R.id.btn_dollar){
            val = r * (1/6.7f);
        }else if(btn.getId() == R.id.btn_euro){
            val = r * (1/11f);
        }else{
            val = r * 500;
        }
        show.setText(String.valueOf(val));
    }
}
