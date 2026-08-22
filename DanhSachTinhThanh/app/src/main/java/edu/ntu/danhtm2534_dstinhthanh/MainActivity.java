package edu.ntu.danhtm2534_dstinhthanh;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Hiển thị dữ liệu lên ListView
        //B1: Cần có dữ liệu
        // ??? từ cơ sở dữ liệu (SQL, noSQL, XML,...
        //ở đây ta hard-code dữ liệu trực tiếp
        //Cần biến phù hợp chứa dữ liệu
        ArrayList<String> dsTenTinhThanhVN;     //khai báo
        dsTenTinhThanhVN = new ArrayList<>();   //tạo thể hiện cụ thể
            //thêm dữ liệu ở đây (đúng ra phải đọc dữ liệu từ 1 nguồn
            dsTenTinhThanhVN.add("Hà Nội");
            dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
            dsTenTinhThanhVN.add("Đồng Nai");
            dsTenTinhThanhVN.add("Nghệ An");
            dsTenTinhThanhVN.add("Bình Thuận");
            dsTenTinhThanhVN.add("Ninh Thuận");
            dsTenTinhThanhVN.add("Khánh Hòa");
            dsTenTinhThanhVN.add("Sóc Trăng");
            dsTenTinhThanhVN.add("Thành phố Cần Thơ");

        //B2. tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this,
                                                     android.R.layout.simple_list_item_1,
                                                     dsTenTinhThanhVN
                                                    );

        //B3. Gắn vào điều khiển hiển thị ListView
        //3.1 Tìm
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //3.2 gắn
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3 lắng nghe và xử lý sự kiện user tương tác




    }
}