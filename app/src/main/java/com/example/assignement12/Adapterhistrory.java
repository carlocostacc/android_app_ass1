package com.example.assignement12;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapterhistrory extends RecyclerView.Adapter<Historyviewholder>{
    Context context;
    List<history_item> items;
    public Adapterhistrory(Context context, List<history_item> items) {
        this.context = context;
        this.items = items;

    }

    @NonNull
    @Override
    public Historyviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("ERROR", "DO YOU SEE ME ?");
        Log.d("ERROR", "DO YOU SEE ME ?");
        Log.d("ERROR", "DO YOU SEE E ?");
        Log.d("ERROR", "DO YOU SEE ME ?");
        Log.d("ERROR", "DO YOU SEE ME ?");
        return new Historyviewholder(LayoutInflater.from(context).inflate(R.layout.data_activity_item_history_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Historyviewholder holder, int position) {
        holder.history_entry_view.setText(items.get(position).getEvent_name());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
