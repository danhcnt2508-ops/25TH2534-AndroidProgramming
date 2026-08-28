# 📱 Android Programming Exercises (TMDANH_25TH2534)

> Kho lưu trữ toàn bộ các bài tập thực hành, ứng dụng mẫu và đồ án nhỏ thuộc học phần **Lập trình Android**. 

Dự án được xây dựng trên môi trường **Android Studio**, sắp xếp theo lộ trình từ làm quen giao diện (Layout), xử lý tài nguyên (Resources), tính toán cơ bản cho đến điều hướng màn hình (Intent) và hiển thị danh sách nâng cao (RecyclerView).

---

## 🛠️ Công nghệ & Môi trường phát triển

* **Ngôn ngữ:** Java / Kotlin
* **Công cụ phát triển (IDE):** Android Studio (Phiên bản mới nhất)
* **SDK tối thiểu (Min SDK):** Android 7.0 (API 24) hoặc cao hơn
* **Công cụ quản lý mã nguồn:** Git & GitHub

---

## 📂 Danh sách các bài tập thực hành

### 🎨 1. Làm quen & Quản lý Giao diện (Layout & Resources)
Tập hợp các bài tập đầu tiên giúp làm quen với cấu trúc dự án Android, thiết kế giao diện bằng XML và sử dụng tài nguyên hệ thống.
* **`HelloAndroid`** — Ứng dụng đầu tiên khởi tạo cấu trúc project, hiển thị dòng chữ "Hello World" và làm quen với quy trình chạy máy ảo (Emulator/Độ phân giải).
* **`vd1LinearLayout01`** — Thực hành sắp xếp các thành phần giao diện (UI Components) theo hàng dọc và hàng ngang sử dụng `LinearLayout`.
* **`SudungDrawableResource`** — Quản lý và tích hợp tài nguyên hình ảnh, cấu hình custom background, bo góc button, hoặc tạo hiệu ứng nhấn bằng cách sử dụng các tệp tin XML trong thư mục `res/drawable`.

### 🧮 2. Ứng dụng Tính toán & Xử lý sự kiện (Event Handling)
Thực hành kết nối giao diện XML với mã nguồn Java/Kotlin (`findViewById`), bắt sự kiện nhấn nút (`OnClickListener`) để xử lý các thuật toán tính toán cơ bản.
* **`AppCong2So2`** — Ứng dụng nhập vào hai số từ giao diện và hiển thị kết quả tổng lên màn hình.
* **`AppTinhBMI`** — Ứng dụng nhập Chiều cao (cm) và Cân nặng (kg) để tính toán chỉ số khối cơ thể (BMI), đồng thời đưa ra nhận xét về thể trạng người dùng.
* **`vd02LinearLayoutPhepToan`** — Thiết kế form giao diện máy tính cơ bản, xử lý bắt lỗi dữ liệu đầu vào trống.
* **`AppCongTrunhanChia`** — Phiên bản máy tính cầm tay hoàn chỉnh hỗ trợ đầy đủ 4 phép tính cơ bản (Cộng, Trừ, Nhân, Chia) kết hợp thông báo lỗi khi chia cho số 0.

### 🔄 3. Chuyển đổi màn hình & Truyền dữ liệu (Intents & Navigation)
Học cách tương tác giữa nhiều màn hình (`Activity`) khác nhau bên trong một ứng dụng bằng cách sử dụng cơ chế `Intent`.
* **`THChuyenManHinh`** — Thực hành chuyển đổi qua lại giữa màn hình chính (Main Activity) sang màn hình phụ (Second Activity) bằng Explicit Intent.
* **`BTCHUYEN3MH`** — Bài tập nâng cao quản lý luồng điều hướng tuần hoàn hoặc phân cấp qua 3 màn hình khác nhau, kết hợp đóng gói và gửi nhận dữ liệu qua lại giữa các Activity (`Bundle` / `PutExtra`).

### 📜 4. Hiển thị danh sách & Dữ liệu phức tạp (Adapter & List Views)
Làm việc với các cấu trúc dữ liệu mảng, danh sách và tối ưu hóa hiệu năng hiển thị tập hợp phần dữ liệu lớn trên thiết bị di động.
* **`DanhSachTinhThanh`** — Ứng dụng hiển thị danh sách các tỉnh thành Việt Nam (sử dụng cấu trúc cơ bản như `ListView` hoặc `Spinner`) và bắt sự kiện khi người dùng nhấn chọn một mục.
* **`UsingRecycleView`** — Ứng dụng hiển thị danh sách nâng cao tối ưu hiệu năng bằng `RecyclerView`. Tri triển khai cấu trúc `ViewHolder`, tạo giao diện tùy biến cho từng dòng dữ liệu (Custom Row Layout) và quản lý tập hợp dữ liệu động một cách mượt mà.

---

## 🚀 Hướng dẫn Import vào Android Studio

1. **Tải mã nguồn về máy local:**
   ```bash
   git clone [https://github.com](https://github.com/danhcnt2508-ops/25TH2534-AndroidProgramming)
   ```
2. **Mở dự án trên Android Studio:**
   * Khởi động **Android Studio**.
   * Chọn **File** $\rightarrow$ **Open** (hoặc **Import Project** ngoài màn hình chào).
   * Trỏ đường dẫn trực tiếp đến thư mục của bài tập cụ thể mà bạn muốn chạy (Ví dụ thư mục: `UsingRecycleView`).
3. **Đồng bộ Gradle:**
   * Chờ Android Studio tự động tải và đồng bộ các thư viện cấu hình trong tệp `build.gradle` (Quá trình này cần kết nối Internet).
4. **Chạy ứng dụng:**
   * Kết nối thiết bị Android thật (đã bật Chế độ nhà phát triển & USB Debugging) hoặc khởi động máy ảo (AVD Manager).
   * Nhấn nút **Run** (Icon hình tam giác màu xanh 🌟) trên thanh công cụ để cài đặt và chạy app.
