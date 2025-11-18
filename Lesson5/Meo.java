package Lesson5;

import java.util.Scanner;

class Meo extends Dongvat
{
    String maulong;
    public Meo()
    {
        super();
        maulong="";
    }
    public Meo(String ten,float cannang,String maulong)
    {
        super(ten,cannang);
        this.maulong=maulong;
    }
    public void keu()   
    {
        System.out.print("Meo meo meo");
    }
    public void Nhap(Scanner sc)
    {
        maulong=sc.nextLine();
    }
    
    
}
