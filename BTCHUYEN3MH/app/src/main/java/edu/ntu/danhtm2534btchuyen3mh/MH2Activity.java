package edu.ntu.danhtm2534btchuyen3mh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MH2Activity extends AppCompatActivity {
    Button nutMH3_2;
    void TimDieuKhien1() {
        //tìm điều khiển nút bấm
        nutMH3_2 = (Button) findViewById(R.id.btnMH3_2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mh2);
        TimDieuKhien1();
        //Gắn bộ lắng nghe sự kiện

        nutMH3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //B1. Tạo một Intent
                Intent intentMH3_2 = new Intent(MH2Activity.this, MH3Activity.class);
                //B2. Gửi
                startActivity(intentMH3_2);

            }
        });
    }
}