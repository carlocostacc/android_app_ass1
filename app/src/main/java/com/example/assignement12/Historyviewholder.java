package com.example.assignement12;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class Historyviewholder extends RecyclerView.ViewHolder{
    TextView history_entry_view;
    public Historyviewholder(@NonNull View itemView) {
        super(itemView);
        history_entry_view = itemView.findViewById(R.id.history_entry);

    }
}
