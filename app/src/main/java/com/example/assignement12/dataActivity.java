package com.example.assignement12;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class dataActivity extends AppCompatActivity {
    ImageButton back_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
//        creating the items for the first recycler view
        List<data_item> items = new ArrayList<data_item>();
        items.add(new data_item("Event A",1));
        items.add(new data_item("Event B",3));
        items.add(new data_item("Event C",7));
        items.get(0).setEvent_count(3);
        items.get(1).setEvent_count(3);
        items.get(2).setEvent_count(3);
//        initializing the two recycler views
        RecyclerView recyclerView_event = findViewById(R.id.recycler_view_event_view);
//        calling setlayout and setadapter for the first recycler view
        recyclerView_event.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_event.setAdapter(new Adapter_data(getApplicationContext(),items));
//        creating items for the history view

//        the second recycler view did not work there was no output when creating the recyclerview and
//        there was no errors
//        _______________________________________________________________________________________
//
//
////        doing the same for the second recycler view
//        recyclerView_history.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView_history.setAdapter(new Adapterhistrory(getApplicationContext(), historyitems));
//_______________________________________________________________________________________

//      creating a LIST VIEW INSTEAD of the second recyclerview
        List<String> historyitems =new ArrayList<String>();
        historyitems.add("Event A");
        historyitems.add("Event A");
        historyitems.add("Event A");
        historyitems.add("Event A");
        historyitems.add("Event A");
        historyitems.add("Event A");
        historyitems.add("Event A");
        ListView listView = findViewById(R.id.history);
//        creating the array adapter for the list
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, historyitems);
        listView.setAdapter(arrayAdapter);


//       making the textview of the overflow button invisible and making it visible when we click on the overflow image button
//      initializing the textview and the overflow button

        ImageButton overflow_button = findViewById(R.id.data_overflow);
        TextView overflow_setting = findViewById(R.id.data_setting);

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
            }
        });
        back_button = findViewById(R.id.data_back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Send_to_main();

            }
        });

    }
    private void Send_to_main(){
        Intent intent = new Intent(dataActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
}

