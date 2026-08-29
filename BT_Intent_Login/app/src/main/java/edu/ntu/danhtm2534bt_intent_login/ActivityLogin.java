package edu.ntu.danhtm2534bt_intent_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button btnXacNhan = (Button) findViewById(R.id.btnOK);


        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xử lý đăng nhập
                //Lấy dữ liệu
                //B1. Tìm tham chiếu
                EditText edtTenDN = (EditText) findViewById(R.id.edtUsername);
                EditText edtPass = (EditText) findViewById(R.id.edtPassword);
                //lấy dữ liệu
                String tenDangNhap = edtTenDN.getText().toString();
                String mk = edtPass.getText().toString();

                if(tenDangNhap.equals("danhtm") && mk.equals("123"))
                {   //chuyển sang màn hình Home
                    Intent iQuiz = new Intent(ActivityLogin.this, HomeActivity.class);
                    //gói dữ liệu vào iQuiz, dạng key - value; key được dùng để bên kia lọc ra dữ liệu
                    iQuiz.putExtra("ten_dang_nhap", tenDangNhap);
                    iQuiz.putExtra("mk_dang_nhap", mk);
                    //gửi đi
                    startActivity(iQuiz);
                }
                else
                {
                    Toast.makeText(ActivityLogin.this, "Mật khẩu không đúng. Vui lòng nhập lại.", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}