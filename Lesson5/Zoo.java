package Lesson5;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.print("Xin moi nhap so luong con Cho");
            int k=sc.nextInt();
            System.out.print("Xin moi nhap so luong con Meo");
            int f=sc.nextInt();
           Dongvat[] dv=new Cho[k];
           Dongvat[] ds= new Meo[f];
            for(int i=0;i<k;i++)
                {
                    System.out.print("Xin moi Nhap cac dieu kien cua con Cho:");
                    dv[i].Nhap(sc);
                    dv[i].keu();
                }
            for(int i=0;i<f;i++)
                {
                    System.out.print("Xin moi Nhap cac dieu kien cua con Meo:");
                    ds[i].Nhap(sc);
                    ds[i].keu();
                }
            for(Dongvat dv1:dv)
            {
                if(dv1 instanceof Meo)
                {
                    Meo m=(Meo)dv1;
                    m.keu();
                }
               else 
                {
                System.out.print("Khong phai con meo");
                }
            }for(Dongvat dv1:ds)
            {
                if(dv1 instanceof Cho)
                {
                    Cho m=(Cho)dv1;
                    m.keu();
                }
               else 
                {
                System.out.print("Khong phai con Cho");
                }
            }
        sc.close();
        
    }
    
}
