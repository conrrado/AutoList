package com.ccamacho.autolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AutoAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new AutoAdapter(populate());
        recyclerView.setAdapter(adapter);
    }

    private List<AutoModel> populate() {
        List<AutoModel> autoModelList = new ArrayList<>();
        autoModelList.add(new AutoModel(R.drawable.auto_porsche_911, "Porsche 911", "650 hp", "1988"));
        autoModelList.add(new AutoModel(R.drawable.auto_tesla, "Tesla Roadster", "200 hp", "2020"));
        autoModelList.add(new AutoModel(R.drawable.auto_camaro_cupe, "Camaro Cupê", "507 hp", "2019"));
        return autoModelList;
    }
}
