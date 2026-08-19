package edu.ntu.apptinhbmi;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void XuLyBMI(View view) {
        //Tham chiếu đến điều triển trên tệp xml, mapping sang file java
        EditText editTextCanNang = findViewById(R.id.edtWeight);
        EditText editTextChieuCao = findViewById(R.id.edtHeight);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        EditText editTextPhanLoai = findViewById(R.id.phanLoai);

        //Lấy dữ liệu về ở điều khiển Cân nặng
        String strWeight = editTextCanNang.getText().toString().trim();
        //Lấy dữ liệu về ở điều khiển chiều cao
        String strHeight = editTextChieuCao.getText().toString().trim();

        //kiểm tra dữ liệu ô cần nhập có trống không
        if (strWeight.isEmpty() || strHeight.isEmpty()) {
            Toast.makeText(this,"Vui lòng nhập đầy đủ cân nặng và chiều cao", Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            //chuyển dữ liệu sang dạng số
            double Weight = Double.parseDouble(strWeight);
            double Height = Double.parseDouble(strHeight);

            if (Height <= 0 || Weight <= 0) {
                Toast.makeText(this, "Chiều cao và cân nặng phải lớn hơn 0!", Toast.LENGTH_SHORT).show();
                return;
            }

            //nếu người dùng nhập chiều cao theo cm (> 3m), tự động đổi sang met
            if (Height > 3.0) {
                Height = Height / 100.0;
            }

            //Tính chỉ số BMI
            double bmi = Weight / (Height * Height);

            //phân loại chỉ số BMI theo WHO
            String phanLoai = "";
            if (bmi < 18.5) {
                phanLoai = "Cân nặng thấp (gầy)";
            } else if (bmi < 25) {
                phanLoai = "Bình thường";
            } else if (bmi == 25) {
                phanLoai = "Thừa cân";
            } else if (bmi <= 29.9) {
                phanLoai = "Tiền Béo phì";
            } else if (bmi <= 34.9) {
                phanLoai = "Béo phì độ 1";
            } else if (bmi <= 39.9) {
                phanLoai = "Béo phì độ 2";
            } else { phanLoai = "Béo phì độ 3";}

            String strBMI = String.format(Locale.US,"%.2f", bmi);
            String strPL = String.format("%s", phanLoai);
            //Hiển thị kết quả ra màn hình
            editTextKetQua.setText(strBMI);
            editTextPhanLoai.setText(strPL);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Dữ liệu nhập vào không hợp lệ", Toast.LENGTH_SHORT).show();
        }


    }
}