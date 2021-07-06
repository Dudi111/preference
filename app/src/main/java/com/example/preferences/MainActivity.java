package com.example.preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText ename, elast, eemail, emobile;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initListeners();
    }
    private void init(){
        ename = findViewById(R.id.etname);
        elast = findViewById(R.id.etlast);
        eemail = findViewById(R.id.etemail);
        emobile= findViewById(R.id.etnumber);
        submit = findViewById(R.id.btnnext);
    }
    private void initListeners(){
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreference.writeStringToPreference(getApplicationContext(),"name",ename.getText().toString());
                SharedPreference.writeStringToPreference(getApplicationContext(),"last",elast.getText().toString());
                SharedPreference.writeStringToPreference(getApplicationContext(),"email",eemail.getText().toString());
                SharedPreference.writeStringToPreference(getApplicationContext(),"number",emobile.getText().toString());
                Intent intent = new Intent(MainActivity.this,NextActivity.class);
                startActivity(intent);
            }
        });
    }
}