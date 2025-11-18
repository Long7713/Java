package Lesson5;

import java.util.Scanner;

public abstract class Dongvat {
    String ten;
    float cannang;
    public Dongvat()
    {   
        ten="DV";
        cannang=0;
    }
    public Dongvat(String ten, float cannang)
    {
        this.ten=ten;
        this.cannang=cannang;
    }
    public  abstract void keu();
    
    public void Xuat()
    {
        System.out.print("\nTen:"+ten+":Cannang:"+cannang+"Kg");
    }
    public void Nhap(Scanner sc)
    {
        ten=sc.nextLine();
        cannang=sc.nextFloat();
    }
}
