package edu.ntu.danhtm2534thchuyenmanhinh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
        //1+. gói dữ liệu
            //1+.1 Tìm điều khiển chứa dữ liệu
        EditText edtHoTen = findViewById(R.id.edtTen);
        EditText edtTuoi = findViewById(R.id.edtTuoi);
            //1+.2 lấy dữ liệu
        String strTen = edtHoTen.getText().toString();
        String strTuoi =  edtTuoi.getText().toString();
            //1+.3 Gói vào thư, đặt 1 key cho mỗi dữ liệu (để bên kia dựa vào đó để lấy)
        thuKichHoatMH2.putExtra("hehe", strTen);
        thuKichHoatMH2.putExtra("hihi", strTuoi);


        //2. Gửi thư mà ko cần phản hồi
        startActivity(thuKichHoatMH2);
    }


}