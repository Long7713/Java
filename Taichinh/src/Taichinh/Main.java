package Taichinh;
import java.util.Scanner;
public class Main
{
    Danhsachtaichinh Qlytaichinh=new Danhsachtaichinh();
    Scanner sc=new Scanner(System.in);
    void Menu(){
        int choice;
       do{
        System.out.println("\n========== Các tính năng quản lý tài chính==========");
        System.out.println("1. Thêm loại tài chính");
        System.out.println("2. Xóa 1 loại tài chính");
        System.out.println("3. Tìm kiếm thông tin về tài chính");
        System.out.println("4. Sửa thông tin  về tài chính");
        System.out.println("5. Xem toàn bộ tài chính hiện có");
        System.out.println("0. Thoát");
        System.out.println("========================================\n");
        System.out.print("Mời bạn lựa chọn: ");
        choice= sc.nextInt();
        switch (choice)
        {
            case 1:
                Qlytaichinh.Them();
                break;
            case 2:
                Qlytaichinh.Xoa();
                break;
            case 3:
                Qlytaichinh.timkiem();
                break;
            case 4:
                Qlytaichinh.Sua();
                break;
            case 5:
                Qlytaichinh.Xem();
                break;
            case 0:
                System.out.println("Thoát khỏi thanh công cụ");
                Qlytaichinh.ghifile();
                break;
            default:
                System.out.println("Hiện ta bạn nhập phương thức đã sai");
        }

        }while(choice!=0);
    }
    public static void main(String[] args)
    {
        Main m=new Main();
        m.Qlytaichinh.docfile();
        m.Qlytaichinh.Xem();
    }
}
