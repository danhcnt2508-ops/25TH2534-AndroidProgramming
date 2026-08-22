package edu.ntu.danhtm2534thchuyenmanhinh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void ChuyenSangMH2(View v) {
        //1. Tạo đối tượng Intent
        Intent thuKichHoatMH2;
            //hàm tạo có 2 tham số, tham số 2 là màn hình chuyển tới (.class)
        thuKichHoatMH2 = new Intent(MainActivity.this, MainActivity2.class);
        //2. Gửi thư mà ko cần phản hồi
        startActivity(thuKichHoatMH2);
    }
}