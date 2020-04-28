package com.clicks.yogi.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.MyButtonID);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // custom dialog
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.custom_dialog);
                Button MyDialog1 =  dialog.findViewById(R.id.MyButton1);
                Button MyDialog2 =  dialog.findViewById(R.id.MyButton2);
                // Button 1 onClickListener...
                MyDialog1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(getApplicationContext(),"Dialog is closed.",
                                Toast.LENGTH_SHORT).show();
                    }
                });
                // Button 2 onClickListener...
                MyDialog2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Custom Dialog",
                                Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
    }
}