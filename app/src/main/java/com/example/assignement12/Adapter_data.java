package com.example.assignement12;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter_data extends RecyclerView.Adapter<Dataviewholder> {
    Context context;
    List<data_item> items;

    public Adapter_data(Context context, List<data_item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public Dataviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Dataviewholder(LayoutInflater.from(context).inflate(R.layout.data_activity_item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Dataviewholder holder, int position) {
        holder.data_name_view.setText(items.get(position).getEvent_name());
        holder.data_amount_view.setText(items.get(position).getData_amount());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
