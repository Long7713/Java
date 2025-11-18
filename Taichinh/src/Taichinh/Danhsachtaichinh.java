package Taichinh;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public  class Danhsachtaichinh implements  Thanhcongcudacbiet
{
    Scanner sc = new Scanner(System.in);
    private ArrayList<Thongtintaichinhkho> danhsachtaichinh = new ArrayList<>();

    public Danhsachtaichinh() {
        danhsachtaichinh = new ArrayList<>();
    }

    @Override
    public void Them() {
        System.out.println("\n========== Các loại tài chính==========");
        System.out.println("1. Vốn ");
        System.out.println("2. Chi phí ");
        System.out.println("3. Thuế ");
        System.out.println("4. Doanh thu ");
        System.out.print("Xin mời nhập loại thông tin muốn thêm theo danh sách trên:");
        int loai = sc.nextInt();

        switch (loai) {
            case 1 -> {
                Von von = new Von();
                von.Nhap();
                danhsachtaichinh.add(von);
            }
            case 2 -> {
                Chiphi chiphi = new Chiphi();
                chiphi.Nhap();
                danhsachtaichinh.add(chiphi);
            }
            case 3 -> {
                Thue thue = new Thue();
                thue.Nhap();
                danhsachtaichinh.add(thue);
            }
            case 4 -> {
                Doanhthubandau doanhthu = new Doanhthubandau();
                doanhthu.Nhap();
                danhsachtaichinh.add(doanhthu);
            }
            default -> System.out.println("Không nằm trong danh mục tài chính.");
        }
    }

    @Override
    public void timkiem() {
        System.out.println("\n========== Các loại tài chính==========");
        System.out.println("1. Vốn ");
        System.out.println("2. Chi phí ");
        System.out.println("3. Thuế ");
        System.out.println("4. Doanh thu ");
        System.out.print("Xin mời nhập loại thông tin muốn tìm theo danh sách như trên:");
        int loai = sc.nextInt();
        sc.nextLine();
        System.out.print("Xin mời nhập mã thông tin muồn tìm:");
        String ma = sc.nextLine().toLowerCase();
        boolean found = false;
        for (Thongtintaichinhkho item : danhsachtaichinh) {
            switch (loai) {
                case 1 -> {
                    if (item instanceof Von && Objects.equals(item.getma(), ma)) {
                        item.Xuat();
                        ((Von) item).getloai();
                        found = true;
                    }
                }
                case 2 -> {
                    if (item instanceof Chiphi && Objects.equals(item.getma(), ma)) {
                        item.Xuat();
                        ((Chiphi) item).getloai();
                        found = true;
                    }
                }
                case 3 -> {
                    if (item instanceof Thue && Objects.equals(item.getma(), ma)) {
                        item.Xuat();
                        ((Thue) item).getloai();
                        found = true;
                    }
                }

                case 4 -> {
                    if (item instanceof Doanhthubandau && Objects.equals(item.getma(), ma)) {
                        item.Xuat();
                        ((Doanhthubandau) item).getloai();
                        found = true;
                    }
                }
                default -> {
                    System.out.println("Không tồn tại mục nào giống yêu cầu");
                    return;
                }
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy dữ liệu phù hợp.");
        }
    }

    @Override
    public void Sua() {
        System.out.println("\n========== Các loại tài chính==========");
        System.out.println("1. Vốn ");
        System.out.println("2. Chi phí ");
        System.out.println("3. Thuế ");
        System.out.println("4. Doanh thu ");
        System.out.println("Xin mời nhập loại  tài chính cần sửa theo số ở trên");
        int loai = sc.nextInt();
        boolean found = false;
        sc.nextLine();
        System.out.println("Xin mời nhập mã cần sửa:");
        String maCantim = sc.nextLine().toLowerCase();

        for (Thongtintaichinhkho item : danhsachtaichinh) {
            switch (loai) {
                case 1 -> {
                    if (item instanceof Von && Objects.equals(item.getma(), maCantim)) {
                        item.Nhap();
                        found = true;
                    }
                }
                case 2 -> {
                    if (item instanceof Chiphi && Objects.equals(item.getma(), maCantim)) {
                        item.Nhap();
                        found = true;
                    }
                }
                case 3 -> {
                    if (item instanceof Thue && Objects.equals(item.getma(), maCantim)) {
                        item.Nhap();
                        found = true;
                    }
                }

                case 4 -> {
                    if (item instanceof Doanhthubandau && Objects.equals(item.getma(), maCantim)) {
                        item.Nhap();
                        found = true;
                    }
                }
                default -> {
                    System.out.println("Không tồn tại mục nào giống với yêu cầu.");
                    return;
                }
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy dữ liệu để sửa.");
        }
    }

    @Override
    public void Xoa() {
        System.out.println("\n========== Các loại tài chính==========");
        System.out.println("1. Vốn ");
        System.out.println("2. Chi phí ");
        System.out.println("3. Thuế ");
        System.out.println("4. Doanh thu ");
        System.out.println("Xin mời nhập loại tài chính cần xóa theo danh sách trên");
        int loaithongtinmuonxoa = sc.nextInt();
        sc.nextLine();
        System.out.println("Xin mời nhập mã cần xóa:");
        String maCanXoa = sc.nextLine().toLowerCase();
        boolean removed = danhsachtaichinh.removeIf(item ->
        {
            switch (loaithongtinmuonxoa) {
                case 1 -> {
                    return item instanceof Von && item.getma().equalsIgnoreCase(maCanXoa);
                }
                case 2 -> {
                    return item instanceof Chiphi && item.getma().equalsIgnoreCase(maCanXoa);
                }
                case 3 -> {
                    return item instanceof Thue && item.getma().equalsIgnoreCase(maCanXoa);
                }
                case 4 -> {
                    return item instanceof Doanhthubandau && item.getma().equalsIgnoreCase(maCanXoa);
                }
                default -> {
                    System.out.println("Không tồn tại loại thông tin này.");
                    return false;
                }
            }
        });

        if (removed) {
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Không tìm thấy dữ liệu để xóa.");
        }
    }

    public void Xem() {
        for (Thongtintaichinhkho element : danhsachtaichinh)
            element.Xuat();
    }

    public void ghifile() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("Taichinh.txt"));
            for (Thongtintaichinhkho tc : danhsachtaichinh) {
                if (tc instanceof Von) {
                    pw.println("Vốn");
                    pw.println(tc.getma());
                    pw.println(tc.getSotien());
                    pw.println(((Von) tc).getNguonvon());
                    pw.println(tc.getNguoiquanly());
                } else if (tc instanceof Thue) {
                    pw.println("Thuế");
                    pw.println(tc.getma());
                    pw.println(tc.getSotien());
                    pw.println(((Thue) tc).getThuesuat());
                    pw.println(tc.getNguoiquanly());
                } else if (tc instanceof Chiphi) {
                    pw.println("Chi phí");
                    pw.println(tc.getma());
                    pw.println(tc.getSotien());
                    pw.println(((Chiphi) tc).getKhoangcanchi());
                    pw.println(tc.getNguoiquanly());
                } else if (tc instanceof Doanhthubandau) {
                    pw.println("Doanh thu");
                    pw.println(tc.getma());
                    pw.println(tc.getSotien());
                    pw.println(((Doanhthubandau) tc).getDoanhthutu());
                    pw.println(tc.getNguoiquanly());
                }
            }
            pw.close();
            System.out.println("Ghi file thành công!");
        } catch (Exception e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    public void docfile() {
        danhsachtaichinh.clear();
        System.out.println("Đang đọc");
        String loai, ma, nguoiquanly;
        double sotien;
        try {
            Scanner sc=new Scanner(new File("Taichinh.txt"));
            while (sc.hasNextLine()) {
                loai = sc.nextLine();
                ma = sc.nextLine();
                sotien=sc.nextDouble();
                sc.nextLine();
                nguoiquanly = sc.nextLine();

                switch (loai) {
                    case "Vốn" -> {
                        String nguonvon = sc.nextLine();
                        Von von = new Von(ma, sotien, nguoiquanly, nguonvon);
                        danhsachtaichinh.add(von);
                    }
                    case "Chi phí" -> {
                        String Khoangcanchi = sc.nextLine();
                        Chiphi chiphi = new Chiphi(ma, sotien, nguoiquanly, Khoangcanchi);
                        danhsachtaichinh.add(chiphi);
                    }
                    case "Thuế" -> {
                        double thuesuat = sc.nextDouble();
                        Thue thue = new Thue(ma, sotien, nguoiquanly, thuesuat);
                        danhsachtaichinh.add(thue);
                    }
                    case "Doanh thu" -> {
                        String doanhthutu = sc.nextLine();
                        Doanhthubandau doanhthu = new Doanhthubandau(ma,sotien, nguoiquanly, doanhthutu);
                        danhsachtaichinh.add(doanhthu);
                    }
                }
            }sc.close();
            System.out.print("Đã đọc file");
        } catch (Exception e) {
            System.out.println("Lỗi đọc file:" + e.getMessage());
        }
    }

}