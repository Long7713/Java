package Lesson5.exercise;

import java.util.Scanner;

public class Phanchinh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Hinhhocj ht=new Hinhtron();
        Hinhhocj hcn= new Hinhchunhat();
        ht.nhap(sc);
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.xuat();
        hcn.nhap(sc);
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.xuat();
        sc.close();
    }
    
}
