package com.example.yzy.helloagain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.yzy.helloagain.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but = (Button) findViewById(R.id.button_send);
        if (but == null) {
            return;
        }
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ((EditText) findViewById(R.id.edit_message)).getText().toString();
                Utils.toast(MainActivity.this, text);
            }
        });
    }
}
