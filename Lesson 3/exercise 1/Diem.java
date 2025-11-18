import java.util.Scanner;

// Lớp Diem đại diện cho một điểm trong mặt phẳng
public class Diem {
    private int x, y;

    // Constructor khởi tạo điểm với tọa độ x, y
    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức dịch chuyển điểm
    public void dichChuyen(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Phương thức xuất tọa độ điểm
    public void xuat() {
        System.out.println("Tọa độ điểm: (" + this.x + ", " + this.y + ")");
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Nhập tọa độ ban đầu ===");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Diem d = new Diem(x, y);

        System.out.println("=== Nhập giá trị dịch chuyển ===");
        int dx = sc.nextInt();
        int dy = sc.nextInt();

        System.out.println("=== Trước khi dịch chuyển ===");
        d.xuat();

        d.dichChuyen(dx, dy);

        System.out.println("=== Sau khi dịch chuyển ===");
        d.xuat();

        sc.close();
    }
}