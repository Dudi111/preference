package com.example.preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
   private TextView text1 , text2 , text3;
   private EditText etseats, etdate;
   private Button mbtnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        init();
        initText();
        mbtnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreference.writeStringToPreference(getApplicationContext(),"seat",etseats.getText().toString());
                SharedPreference.writeStringToPreference(getApplicationContext(),"date",etdate.getText().toString());
                Intent intent=new Intent(NextActivity.this, ConfirmActivity.class);
                startActivity(intent);
            }
        });
    }

    private void init(){
        text1 = findViewById(R.id.tvtext1);
        text2 = findViewById(R.id.tvtext2);
        text3 = findViewById(R.id.tvtext3);
        etseats=findViewById(R.id.etseat);
        etdate=findViewById(R.id.etdate);
        mbtnnext=findViewById(R.id.btnbook);
    }

    private void initText(){
        text1.setText(SharedPreference.readString(getApplicationContext(),"name"));
        text2.setText(SharedPreference.readString(getApplicationContext(),"last"));
        text3.setText(SharedPreference.readString(getApplicationContext(),"email"));

    }
}