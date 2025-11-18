package Taichinh;
import java.util.Scanner;
class Chiphi extends Thongtintaichinhkho {
    Scanner sc=new Scanner(System.in);
     String Khoangcanchi;
     static protected String loai="Chi phí";
        Chiphi() {
            super();
            Khoangcanchi="";
        }
        Chiphi(String ma,double Sotien,String Nguoiquanly,String Khoangcanchi)
         {
            super(ma,Sotien,Nguoiquanly);
            this.Khoangcanchi=Khoangcanchi;
         }
         @Override
         public void Nhap () {
             super.Nhap();
             sc.nextLine();
             System.out.print("Xin mời nhập lý do cần chi:");
             Khoangcanchi=sc.nextLine();
         }
   public void Xuat()
   {
       System.out.println("\n========== Thông tin khoảng chi==========");
       super .Xuat();
       System.out.println("Khoảng cần chi là:"+Khoangcanchi);
   }
    public void getloai()
    {
        System.out.print("Loại là:"+loai);
    }
    public String getKhoangcanchi()
    {return  Khoangcanchi;}
}
