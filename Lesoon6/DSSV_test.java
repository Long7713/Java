package Lesoon6;

import java.util.Scanner;

public class DSSV_test {
        public static void main(String[] args) {
            
            Scanner sc= new Scanner(System.in);
            DSSV ds=new DSSV();
            ds.Nhap(sc);
            ds.Xuat();
            ds.them(sc);
            ds.Xuat(); 
            ds.Sua(sc);
            ds.Xuat();
            ds.Timkiem(sc);
            ds.Xuat();
            Sinhvien sv1=new Sinhvien("A001","Nguyen Van A","0912345678");
            ds.them(sv1);
            ds.Xuat();
            ds.Sua("A001");
            ds.Xoa(sc);
            

        }
    
}
