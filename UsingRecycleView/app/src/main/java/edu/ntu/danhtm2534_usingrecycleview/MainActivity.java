package edu.ntu.danhtm2534_usingrecycleview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //bước 3
        recyclerViewDatas = getDataForRecyclerView();
        //bước 4
        recyclerViewLandscape = findViewById(R.id.recycleLand);
        //bước 5
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandscape.setLayoutManager(layoutLinear);
        //bước 6
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewDatas);
        //bước 7
        recyclerViewLandscape.setAdapter(landScapeAdapter);

    }

    ArrayList<LandScape> getDataForRecyclerView() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<>();
        LandScape landScape1 = new LandScape("kheops_pyramid", "Kim tự tháp - Ai Cập");
        dsDuLieu.add(landScape1);
        dsDuLieu.add( new LandScape("sydneyoperahouse", "Nhà hát Sydney ÚC"));
        dsDuLieu.add( new LandScape("tour_eiffel_at_sunrise_from_the_trocadero", "Tháp Eiffel - Pháp"));
        return dsDuLieu;
    }
}