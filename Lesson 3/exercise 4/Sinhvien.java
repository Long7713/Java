
import java.util.Scanner;

public class Sinhvien 
{
        private String Masv;
        private String Hovaten;
        private String Lop;
        private float diemmon1,diemmon2,diemmon3;
        public void Nhap(Scanner sc)
            {
                System.out.print("Xin moi nhap ma so sinh vien:");  
                Masv=sc.nextLine();
                System.out.print("Xin moi nhap ho va ten:");
                Hovaten=sc.nextLine();
                System.out.print("Xin moi nhap Lop");
                Lop=sc.nextLine();
                System.out.print("Xin moi nhap diem tung mon:");
                diemmon1=sc.nextFloat();
                diemmon2=sc.nextFloat();
                diemmon3=sc.nextFloat();
            }  
            public Sinhvien(String x,String y,String z,float k,float j,float l )
            {
                Masv=x;
                Hovaten=y;
                Lop=z;
                diemmon1=k;
                diemmon2=j;
                diemmon3=l;
            }
            public Sinhvien()
            {}
            public  float diemtrungbinh()

            {
                return (diemmon1+diemmon2+diemmon3)/3;
            }
            public String xephang()
            {   
               float dtb= diemtrungbinh();
                if(dtb>=8.0)  return ":Giỏi";
                else if(dtb>=6.5) return ":Khá";
                else if(dtb>=5) return":Trung bình";
                else return ":rớt";
            }
            void Xuat()
            {
                    System.out.println("Họ và tên sinh viên"+Hovaten);
                    System.out.println("Mã số sinh viên là:"+Masv);
                    System.out.println("Lớp"+Lop);
                    System.out.println("Điểm trung bình là"+xephang());
            }       
        public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            Sinhvien s= new Sinhvien();
            s.Nhap(sc);
            s.Xuat();
            Sinhvien s1=new Sinhvien("3124411155","Tran Viet Long","DCT124C5",5,6,7);
            s1.Xuat();
            sc.close();
        }




}
