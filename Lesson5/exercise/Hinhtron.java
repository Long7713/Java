package Lesson5.exercise;

import java.util.Scanner;

class Hinhtron extends Hinhhocj
{
    float bankinh;
    double Chuvi,Dientich;
    public Hinhtron(){}
    public Hinhtron(float bankinh)
    {
        this.bankinh=bankinh;
    }
    public void nhap(Scanner sc)
    {
        System.out.print("Xin moi nhao ban kinh");  
        bankinh=sc.nextFloat();
    }
    public void tinhchuvi()
    {
        Chuvi=2*(3.14*bankinh);
    }
    public void tinhdientich()
    {
        Dientich=bankinh*bankinh*3.14;
    } 
    public void  xuat()
    {
        System.out.println("Chu vi va dien tich la "+Chuvi+" va "+Dientich);
    }
}
