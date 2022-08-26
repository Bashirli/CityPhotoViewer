package com.bashirli.cityphotoviewer;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bashirli.cityphotoviewer.databinding.RecyclerXmlBinding;

import java.util.ArrayList;

public class RecyclerData extends RecyclerView.Adapter<RecyclerData.DataHolder> {
ArrayList<Data> data_array;

    public RecyclerData(ArrayList<Data> data_array) {
        this.data_array = data_array;
    }

    @NonNull
    @Override
    public DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerXmlBinding recyclerXmlBinding= RecyclerXmlBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new DataHolder(recyclerXmlBinding);
    }

    @Override
    public void onBindViewHolder(RecyclerData.DataHolder holder, int position) {
  holder.binding.recyclerviewer.setText(data_array.get(position).seher_adi);

  holder.itemView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent intent=new Intent(holder.itemView.getContext(),SekiliGoster.class);

Singleton singleton=Singleton.getInstance();
singleton.setData(data_array.get(position));
holder.itemView.getContext().startActivity(intent);
      }
  });

    }

    @Override
    public int getItemCount() {
        return data_array.size();
    }

    public class DataHolder extends RecyclerView.ViewHolder{
       private RecyclerXmlBinding binding;

        public DataHolder(RecyclerXmlBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
