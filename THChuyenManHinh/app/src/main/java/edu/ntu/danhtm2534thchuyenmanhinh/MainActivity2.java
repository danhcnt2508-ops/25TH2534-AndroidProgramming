package edu.ntu.danhtm2534thchuyenmanhinh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        // Xây dựng bộ lắng nghe, xử lý theo cách khác OnClick
        //hoặc có thể làm theo các giống MH1

        //1. Tìm đối tượng cần gắn bộ lắng nghe
        Button btnManHinh2 = findViewById(R.id.btnMH2);
        //2. Gắn bộ lằng nghe
        btnManHinh2.setOnClickListener(BoLangNgheChuyenMH); //ta sẽ code ngay ở dưới

        //Khi màn hình mở ra, ta lấy về Intent đã kích hoạt
        Intent thuNhanDuoc = getIntent();
        //bóc dữ liệu ra xem
        String ten = thuNhanDuoc.getStringExtra("hehe");
        String tuoi = thuNhanDuoc.getStringExtra("hihi");
        //Đưa lên điều khiển

        TextView tvTen = findViewById(R.id.tvHoTen);
        TextView tvTuoi = findViewById(R.id.tvTuoi);
        tvTen.setText(ten);
        tvTuoi.setText("Tuổi: " + tuoi);    // + là phép nối chuối của java, android


    }
    //ở đây, ngoài hàm OnCreate
    View.OnClickListener BoLangNgheChuyenMH = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // xử lý cụ thể ở đây
            //tạo thư
            Intent thuKichHoatMH1 = new Intent(MainActivity2.this, MainActivity.class);
            //2. Gửi đi
            startActivity(thuKichHoatMH1);
        }
    };


}