package com.example.assignement12;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Myviewholder extends RecyclerView.ViewHolder {
    TextView counterView;
    TextView counter_nameView;
    public Myviewholder(@NonNull View itemView) {
        super(itemView);
        counterView = itemView.findViewById(R.id.counter_name);
        counter_nameView = itemView.findViewById(R.id.set_name);

    }
    void Set_not_Clickable(ArrayList<Item> dataItems){
        //    creating a function that makes every element of the recycler view clickable or not

        itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // get position
                int pos = getAdapterPosition();

                // check if item still exists
                if(pos != RecyclerView.NO_POSITION){
                    Item clickedDataItem = dataItems.get(pos);

                }
            }
        });

    }
}
