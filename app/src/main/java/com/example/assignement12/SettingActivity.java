package com.example.assignement12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    //    creating the overflow menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.overflow_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //    creating a callback method to know what option was selected in the overflow menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

//        once the edit settings is pressed the user will be able to edit the page
        if(item.getItemId() == R.id.edit_settings){
            assert true;
        }
        return super.onOptionsItemSelected(item);
    }
}
