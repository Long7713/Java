package Lesson5.exercise;

import java.util.Scanner;

class Hinhchunhat extends Hinhhocj 
{
        float cd,cr;
        double Chuvi,Dientich;
        public Hinhchunhat(){}
        public Hinhchunhat(float cd, float cr)
        {
            this.cd=cd;
            this.cr=cr;
        }
        public void nhap(Scanner sc)
        {
            System.out.print("Xin moi nhap chieu dai");
            cd=sc.nextFloat();
            System.out.print("Xin moi nhap chieu rong");
            cr=sc.nextFloat();
        }
        public void tinhchuvi()
        {
            Chuvi=(cd+cr)*2;
        }
        public void tinhdientich()
        {
        Dientich=cd*cr;
        }
        public void xuat()
        {
            System.out.println("Chu vi va Dien tich cua hinh chu nhat la"+Chuvi+"va"+Dientich);
        }

}
