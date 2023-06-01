package com.example.assignement12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class SettingActivity extends AppCompatActivity {
    ImageButton back_button;
    Boolean editing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Log.d("ERROR","SOMETHING");

        //     logic for the edit text view
//     initialising the edit view
        EditText edit1 = findViewById(R.id.set_name_1);
        EditText edit2 = findViewById(R.id.set_name_2);
        EditText edit3 = findViewById(R.id.set_name_3);
        EditText edit4 = findViewById(R.id.set_name_4);
//        setting every edit text view to disabled
        edit1.setEnabled(false);
        edit2.setEnabled(false);
        edit3.setEnabled(false);
        edit4.setEnabled(false);


//        deleted the recycler view because it was hard to go and get onclick events for the edit text view
////        creating recycler view
//        RecyclerView recyclerView = findViewById(R.id.recycler_view);
//        List<Item> items = new ArrayList<Item>();
//        items.add(new Item("counter name 1","enter name here"));
//        items.add(new Item("counter name 2","enter name here"));
//        items.add(new Item("counter name 3", "enter name here"));
//        items.add(new Item("Max counts","enter max count here"));
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
//      creating the overflow menu functionality
        ImageButton overflow_button = findViewById(R.id.overflow_settings);
        TextView overflow_setting = findViewById(R.id.edit_settings_text);

//      settings the visible variable to false
        final Boolean[] visible = {false};
        overflow_setting.setVisibility(View.INVISIBLE);
//      creating the logic to make the text appear and dissapear
        overflow_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!visible[0]){
                    overflow_setting.setVisibility(View.VISIBLE);
                    visible[0] = true;
                }}
        });

//      creating the logic for when the text view is clicked
        overflow_setting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                overflow_setting.setVisibility(View.INVISIBLE);
                visible[0] = false;
                edit1.setEnabled(true);
                edit2.setEnabled(true);
                edit3.setEnabled(true);
                edit4.setEnabled(true);
            }
        });
        // back button functionality
        back_button = findViewById(R.id.back_settings_Button);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Send_to_main();

            }
        });

//        creating the shared preferences
        SharedPreferences sharedPreferences_eventA = getApplicationContext().getSharedPreferences(getString(R.string.Event_A_sharedPreference), Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences_eventB = getApplicationContext().getSharedPreferences(getString(R.string.Event_B_sharedPreference), Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences_eventC = getApplicationContext().getSharedPreferences(getString(R.string.Event_C_sharedPreference), Context.MODE_PRIVATE);
        SharedPreferences sharedPreferences_max_count = getApplicationContext().getSharedPreferences(getString(R.string.Max_Count_sharedPreference), Context.MODE_PRIVATE);

        String eventA  = sharedPreferences_eventA.getString(getString(R.string.Event_A_name_key),"");
        String eventB  =sharedPreferences_eventB.getString(getString(R.string.Event_B_name_key),"");
        String eventC  =sharedPreferences_eventC.getString(getString(R.string.Event_C_name_key),"");
        String Max_count  =sharedPreferences_max_count.getString(getString(R.string.Max_Count_key),"");

//        text views related to the shared preferences
        TextView counterA = findViewById(R.id.counter_name_1);
        TextView counterB = findViewById(R.id.counter_name_2);
        TextView counterC = findViewById(R.id.counter_name_3);
        TextView counterD = findViewById(R.id.counter_name_4);
        if(eventA == null){
            counterA.setText("Counter 1 Name");
        }
        if(eventB == null){
            counterB.setText("Counter Name 2");
        }
    }
//    function to send back to the main activity
    private void Send_to_main(){
        Intent intent = new Intent(SettingActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
    //    creating the overflow menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d("ERROR","SOMETHING");
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.overflow_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //    creating a callback method to know what option was selected in the overflow menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

//        once the edit settings is pressed the user will be able to edit the page
        if(item.getItemId() == R.id.edit_settings){
            Toast.makeText(this,"item selected",Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
