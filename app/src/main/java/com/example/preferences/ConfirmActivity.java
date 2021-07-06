package com.example.preferences;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmActivity extends AppCompatActivity {
    private TextView view1, view2, view3, view4,view5;
    private Button mbtnconfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        initview();
        settext();
      mbtnconfirm.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Context context=getApplication();
              new AlertDialog.Builder(context)
                      .setTitle("Delete entry")
                      .setMessage("Are you sure you want to delete this entry?")
                      .show();
          }
      });
    }
    private void initview(){
        view1=findViewById(R.id.tvfinal1);
        view2=findViewById(R.id.tvfinal2);
        view3=findViewById(R.id.tvfinal3);
        view4=findViewById(R.id.tvfinal4);
        view5=findViewById(R.id.tvfinal5);
        mbtnconfirm=findViewById(R.id.btnconfirm);
    }
    private void settext(){
        view1.setText(SharedPreference.readString(getApplicationContext(),"name"));
        view2.setText(SharedPreference.readString(getApplicationContext(),"last"));
        view3.setText(SharedPreference.readString(getApplicationContext(),"email"));
        view4.setText(SharedPreference.readString(getApplicationContext(),"seat"));
        view5.setText(SharedPreference.readString(getApplicationContext(),"date"));
    }
}