package Lesoon6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class QuanlyDSSV {
    DSSV dssv=new DSSV();

    public void menu()
     { 
         Scanner sc= new Scanner(System.in);
            System.out.println("Xin moi nhap thong tin sinh vien can them:");
            dssv.them(sc);
            System.out.println("Xin moi Xoa thong tin can xoa:");
            dssv.Xoa(sc);
            System.out.println("Xin moi nhap thong tin sua:");
            dssv.Sua(sc);
            System.out.println("Xin moi nhap mssv de tim:");
            dssv.Timkiem(sc);
             try {
               
                 BufferedReader input = new BufferedReader(new FileReader("DSSV.java"));
                String line = input.readLine();
                while (line != null) {
                        // chia chuỗi thành các chuỗi con phân cách bởi dấu phẩy
                        String[] arr = line.split(",");
                        for (int i = 0; i < arr.length; i++) {
                            System.out.println(arr[i]);
                        }
                        line = input.readLine();
                                     }
                          input.close();
                 } catch (Exception e){}
            try     
            {
                FileWriter fw=new FileWriter("DSSV.java");
                fw.write("Hello Word");
                fw.close();
            }
            catch (Exception e){
            System.out.print(e);}
    }
}
