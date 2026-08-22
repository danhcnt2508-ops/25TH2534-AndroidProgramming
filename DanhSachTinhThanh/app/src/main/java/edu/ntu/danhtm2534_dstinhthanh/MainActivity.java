package edu.ntu.danhtm2534_dstinhthanh;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> dsTenTinhThanhVN;     //khai báo

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
        //đã chuyển khai báo biến ra ngoài ở trên
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
        //gắn bộ lằng nghe vào
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);

    }

    //tạo bộ lắng nghe và xử lý sự kiên OnItemClick, đặt vào 1 biến
    //vd: BoLangNghevaXL
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //Code xử lý ở đây

            //i là vị trí phần tử vừa được click
            //ví dụ: xử lý ở đây là hiện lên màn hình 1 thông báo ngắn về vị trí của phần tử vừa chọn
            //Toast.makeText(MainActivity.this, "Bạn vừa chọn: " + String.valueOf(i), Toast.LENGTH_LONG).show();

           //lây giá trị của phần tử thứ i
            String tenTinhChon = dsTenTinhThanhVN.get(i);
            Toast.makeText(MainActivity.this, tenTinhChon, Toast.LENGTH_LONG).show();


        }
    };
}