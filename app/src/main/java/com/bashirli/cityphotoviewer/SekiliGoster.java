package com.bashirli.cityphotoviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bashirli.cityphotoviewer.databinding.ActivitySekiliGosterBinding;

public class SekiliGoster extends AppCompatActivity {
private ActivitySekiliGosterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySekiliGosterBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

       // Intent intent=getIntent();
     //  Data newData=(Data)intent.getSerializableExtra("data");


        Singleton singleton=Singleton.getInstance();
        Data selectedData=singleton.getData();
      binding.city.setText(selectedData.seher_adi);
      binding.country.setText(selectedData.olke_adi);
      binding.imageView.setImageResource(selectedData.sekil_id);

    }
}