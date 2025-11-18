package Lesson5;

import java.util.Scanner;

class Cho extends Dongvat
{
    String maulong;
    public Cho()
    {
        super();
        maulong="";
    }
    public Cho(String ten, float cannang, String maulong)
    {
        super(ten,cannang);
        this.maulong=maulong;
    }
    public void keu()
    {
        System.out.print(" Gau gau gau");
    }
    public void Nhap(Scanner sc)
    {
        maulong=sc.nextLine();
        
    }
}
