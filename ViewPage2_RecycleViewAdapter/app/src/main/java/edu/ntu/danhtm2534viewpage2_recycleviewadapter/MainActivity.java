package edu.ntu.danhtm2534viewpage2_recycleviewadapter;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> viewPagerDatas;
    ViewPager2 viewPager2Land;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        viewPagerDatas = getDataForViewPager();
        viewPager2Land = findViewById(R.id.vp2Land);
        landScapeAdapter = new LandScapeAdapter(this, viewPagerDatas);
        viewPager2Land.setAdapter(landScapeAdapter);
        viewPager2Land.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }

        });

    ArrayList<LandScape> getDataForViewPager() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<>();
        LandScape landScape1 = new LandScape("kheops_pyramid", "Kim tự tháp - Ai Cập");
        dsDuLieu.add(landScape1);
        dsDuLieu.add( new LandScape("sydneyoperahouse", "Nhà hát Sydney ÚC"));
        dsDuLieu.add( new LandScape("tour_eiffel_at_sunrise_from_the_trocadero", "Tháp Eiffel - Pháp"));
        dsDuLieu.add(new LandScape("statue_de_la_liberte_new_york", "Tượng nữ thần tự do - Mỹ"));
        dsDuLieu.add(new LandScape("the_great_wall_of_china", "Vạn lý trường thành - Trung Quôc"));
        dsDuLieu.add(new LandScape("colosseum_in_rome_italy", "Đấu trường La Mã - Ý"));
        return dsDuLieu;
    }
}