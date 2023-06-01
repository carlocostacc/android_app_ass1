package com.example.assignement12;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Dataviewholder extends RecyclerView.ViewHolder {
    TextView data_name_view;
    TextView data_amount_view;
    public Dataviewholder(@NonNull View itemView) {
        super(itemView);
        data_name_view = itemView.findViewById(R.id.data_name);
        data_amount_view = itemView.findViewById(R.id.data_amount);
    }
}
