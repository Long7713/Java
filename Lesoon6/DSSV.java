package Lesoon6;

import java.util.Arrays;
import java.util.Scanner;

public class DSSV  
{
    int n;
    Sinhvien[] dssbv=new Sinhvien[n];
    //Gọi có không tham số
    public DSSV()
    {
        n=0;
        dssbv=new Sinhvien[0];
    }
    //Gọi có tham số
    public DSSV(int n,Sinhvien[] dssbv)
    {
          
        this.n=n;
        this.dssbv=dssbv;
    }
    //Phương thức nhập
    public void Nhap(Scanner sc)
    {
        System.out.print("Xin moi nhap so luong");
        n=sc.nextInt();
        dssbv=new Sinhvien[n];
        for(int i=0;i<n;i++)
        {
            dssbv[i]=new Sinhvien();
            dssbv[i].Nhap(sc);
        }
        sc.close();
    }
    //Phương thức xuất( của Sinhvien)
    public void Xuat()
    {
            for(int i=0;i<n;i++)
                dssbv[i].Xuat();
    }
    //Phương thức thêm 
    //..=Arrays.copyOf(..,n+1) là tăng 1 phần tử so với ban đầu 
    public void them(Scanner sc)
    {
        dssbv=Arrays.copyOf(dssbv,n+1);
        dssbv[n]= new Sinhvien();
        System.out.println("Nhap thong tin sinh vien");
        dssbv[n].Nhap(sc);
        n++;
        sc.close();
    }
    public void them(Sinhvien x)
    {
        dssbv=Arrays.copyOf(dssbv,n+1);
        dssbv[n]=new Sinhvien();
    }
    //Phương thức sửa 
    //getSV().equalsIgnoreCase(ma) với ma là dữ liệu cần tìm,equalsIgnoreCase là lệnh tìm
    //getSV là dữ liệu sinh vien sau khi qua điều kiện

    public void Sua(Scanner sc)
    {
        sc.nextLine();
        System.out.print("Xin moi nhao massv can sua");
        String ma=sc.nextLine();
        boolean found=false;

        for(int i=0;i<n;i++)
        {
            if(dssbv[i].getSV().equalsIgnoreCase(ma))
            { 
            System.out.println("Xin moi nhap thong tin sinh vien can sua:");
            dssbv[i].Nhap(sc);
            found=true;
            break;
            }


        }
        if(!found)
            System.out.println("Khong tim thay massv can tim: " + ma);
    }
    public void Sua(String ma)
    {
                Scanner sc=new Scanner(System.in);
             boolean found=false;
      for(int i=0;i<n;i++)
        {
            if(dssbv[i].getSV().equalsIgnoreCase(ma))
            { 
            System.out.println("Xin moi nhap thong tin sua cua sinh vien:");
            dssbv[i].Nhap(sc);
            found=true;
            break;
            }

        }
        if(!found)
        System.out.println("Khong tim thay sinh vien:");
        sc.close();

    }

    //Phương thức tìm kiếm 
    public void Timkiem(Scanner sc)
    {

        sc.nextLine();
        boolean found=false;
        System.out.print("Xin moi nhap masv can tim:");
        String ma=sc.nextLine();
            for(int i=0;i<n;i++)
                {
                    if(dssbv[i].getSV().equalsIgnoreCase(ma))
                    {
                        dssbv[i].Xuat();
                        found=true;
                        break;
                    }
                }
        if(!found)
            System.out.println("Khong tim thay ma sinh vien can tim");
        sc.close();
    }
    public void Xoa(Scanner sc)
    {   
        sc.nextLine();
        System.out.print("Nhap ma sinh vien can xoa:");
        String ma=sc.nextLine();
        boolean found=false;
        for(int i=0;i<n;i++)
        {
          if(dssbv[i].getSV().equalsIgnoreCase(ma))
            {
                for(int j=i;j<n-1;j++)
                    dssbv[j]=dssbv[j+1]; 
            n--;
            dssbv=Arrays.copyOf(dssbv, n);  
            found=true;
            System.out.print("Da xoa sinh vien do:");
            break;
            }
       
        }
        if(!found)
        System.out.println("Khong tim thay sinh vien can xoa");
    }
    public void Xoa(String ma)
    {
        boolean found=false;
        for(int i=0;i<n;i++)
        {
          if(dssbv[i].getSV().equalsIgnoreCase(ma))
            {
                for(int j=i;j<n-1;j++)
                    dssbv[j]=dssbv[j+1]; 
            n--;
            dssbv=Arrays.copyOf(dssbv, n);  
            found=true;
            System.out.print("Da xoa sinh vien do:");
            break;
            }
       
        }
        if(!found)
        System.out.println("Khong tim thay sinh vien can xoa");
        }
        
    }
