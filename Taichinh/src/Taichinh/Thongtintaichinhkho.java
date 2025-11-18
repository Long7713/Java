package Taichinh;

import java.util.Scanner;
public class Thongtintaichinhkho implements Nhapxuat {
      protected  String ma;
      protected  double Sotien;
      protected String Nguoiquanly;
    Scanner sc=new Scanner(System.in);
           public Thongtintaichinhkho()
        {
            Sotien=0.0;
            ma=" ";
            Nguoiquanly=" ";
        }
        public Thongtintaichinhkho(String ma, double Sotien, String Nguoiquanly)
        {
            this.ma=ma;
            this.Sotien=Sotien;
            this.Nguoiquanly=Nguoiquanly;
        }

       @Override
        public void Nhap()
        {
                System.out.print("Xin mời nhập mã:");
                ma=sc.nextLine();
                System.out.print("Xin mời nhập số tiền:");
                Sotien=sc.nextDouble();
                sc.nextLine();
                System.out.print("Xin mời nhập người quản lý:");
                Nguoiquanly=sc.nextLine();
        }
        @Override
        public void Xuat()
        {
           System.out.println("Mã thông tin là:"+ma);
           System.out.println("Số tiền là:"+Sotien);
           System.out.println("Người quản lý là:"+Nguoiquanly);
        }

        public String getma()
        {return  ma;}
        public double getSotien()
        {return Sotien;}
        public String getNguoiquanly()
        {return Nguoiquanly;}
}
