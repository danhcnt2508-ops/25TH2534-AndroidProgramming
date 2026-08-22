package edu.ntu.danh2534myapplication;

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //lăng nghe và xử lý sự kiện cộng
    public void PhepCong (View view) {
        EditText SoThuNhat = findViewById(R.id.edtSoThuNhat);
        EditText SoThuHai = findViewById(R.id.edtSoThuHai);
        EditText KetQua = findViewById(R.id.edtKQ);

        String soThuI = SoThuNhat.getText().toString();
        String soThuII = SoThuHai.getText().toString();

        int so_I = Integer.parseInt(soThuI);
        int so_II = Integer.parseInt(soThuII);

        int Cong = so_I + so_II;

        String Tong = String.valueOf(Cong);
        KetQua.setText(Tong);

    }

    //Lắng nghe và xử lý sự kiện trừ
    public void PhepTru (View view) {
        EditText SoThuNhat = findViewById(R.id.edtSoThuNhat);
        EditText SoThuHai = findViewById(R.id.edtSoThuHai);
        EditText KetQua = findViewById(R.id.edtKQ);

        String SoThuI = SoThuNhat.getText().toString();
        String SoThuII = SoThuHai.getText().toString();

        int so_I = Integer.parseInt(SoThuI);
        int so_II = Integer.parseInt(SoThuII);

        int Tru = so_I - so_II;

        String Hieu = String.valueOf(Tru);

        KetQua.setText(Hieu);
    }

    //Lắng nghe và xử lý sự kiện nhân
    public void PhepNhan (View view) {
        EditText SoThuNhat = findViewById(R.id.edtSoThuNhat);
        EditText SoThuHai = findViewById(R.id.edtSoThuHai);
        EditText KetQua = findViewById(R.id.edtKQ);

        String SoThuI = SoThuNhat.getText().toString();
        String SoThuII = SoThuHai.getText().toString();

        int so_I = Integer.parseInt(SoThuI);
        int so_II = Integer.parseInt(SoThuII);

        int Nhan = so_I * so_II;

        String Tich = String.valueOf(Nhan);

        KetQua.setText(Tich);
    }

    //Lắng nghe và xử lý sự kiện chia
    public void PhepChia (View view) {
        EditText SoThuNhat = findViewById(R.id.edtSoThuNhat);
        EditText SoThuHai = findViewById(R.id.edtSoThuHai);
        EditText KetQua = findViewById(R.id.edtKQ);

        String SoThuI = SoThuNhat.getText().toString();
        String SoThuII = SoThuHai.getText().toString();

        int so_I = Integer.parseInt(SoThuI);
        int so_II = Integer.parseInt(SoThuII);

        double Chia = 0;
        String Thuong;
        if (so_II != 0) {
            Chia = (double) so_I / so_II;
            Thuong = String.valueOf(Chia);
            KetQua.setText(Thuong);
        } else {
            Thuong = "Không thể chia cho 0";
            KetQua.setText(Thuong);
        }
    }
}