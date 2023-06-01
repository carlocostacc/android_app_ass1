package com.example.assignement12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    initializing buttons
    Button button_settings;
    Button button_show_count;
    int event_1 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_settings = findViewById(R.id.button_settings);
        button_show_count = findViewById(R.id.show_count);

//        setting the on click listeners for the buttons
        button_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Send_to_settings();

            }
        });
        button_show_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Send_to_data();
            }
        });

    }

    private void Send_to_data() {
        Intent intent = new Intent(MainActivity.this, dataActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }

    private void Send_to_settings(){
        Intent intent = new Intent(MainActivity.this, SettingActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
}