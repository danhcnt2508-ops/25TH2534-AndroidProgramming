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

public class MH3Activity extends AppCompatActivity {
    Button nutMH3_1;
    void TimDieuKhien2() {
        //tìm điều khiển nút bấm
        nutMH3_1 = (Button) findViewById(R.id.btnMH3_1);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mh3);
        TimDieuKhien2();
        //Gắn bộ lắng nghe sự kiện

        nutMH3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMH3_1 = new Intent(MH3Activity.this, MainActivity.class);
                startActivity(intentMH3_1);
            }
        });
    }
}