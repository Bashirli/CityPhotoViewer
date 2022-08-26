package com.bashirli.cityphotoviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.bashirli.cityphotoviewer.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;

    ArrayList<Data> data_array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
data_array=new ArrayList<>();
        Data paris=new Data("Paris","Fransa",R.drawable.paris);
        Data istanbul=new Data("İstanbul","Türkiyə",R.drawable.istanbul);
        Data moskva=new Data("Moskva","Rusiya",R.drawable.moscow);
        Data newyork=new Data("New York","Amerika Birləşmiş Ştatları",R.drawable.newyork);
       data_array.add(moskva); data_array.add(newyork);
        data_array.add(paris);
        data_array.add(istanbul);

        /*
        LISTVIEW

        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,
                data_array.stream().map(data -> data.seher_adi).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,SekiliGoster.class);
                intent.putExtra("data",data_array.get(i));
                startActivity(intent);
            }
        });
*/

binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
RecyclerData rd=new RecyclerData(data_array);
binding.recyclerView.setAdapter(rd);



      //  Bitmap parisMap= BitmapFactory.decodeResource(getResources(),R.drawable.paris);

    }
}