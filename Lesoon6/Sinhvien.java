package Lesoon6;

import java.util.Scanner;

public class Sinhvien {
        String Masv,Hoten,SDT;
        public Sinhvien(){}
        public Sinhvien(String Masv, String Hoten, String SDT)
        {
            this.Masv=Masv;
            this.Hoten=Hoten;
            this.SDT=SDT;
        }   
        public Sinhvien(Sinhvien msv, Sinhvien ht, Sinhvien sdt)
        {
            this.Masv=msv.Masv;
            this.Hoten=ht.Hoten;
            this.SDT=sdt.SDT;
        }
        public void Nhap(Scanner sc)
        {
            Masv=sc.nextLine();
            Hoten=sc.nextLine();
            SDT=sc.nextLine();
        }
        public void Xuat()
        {
            System.out.println("Masv la:"+Masv);
            System.out.println("Hoten la:"+Hoten);
            System.out.println("Sodienthoai la:"+SDT);
        }
        public void setSinhvien(String Masv,String Hoten, String SDT)
        {
            if(SDT.length()>12)
            {
                System.out.print("Lamdeo gi co so nao tren 11 chu so:");
            }
            else
            {
            this.SDT=SDT;
            }
        } 
        public String getSV()
        {
            return Masv+Hoten+SDT;
        }
}
