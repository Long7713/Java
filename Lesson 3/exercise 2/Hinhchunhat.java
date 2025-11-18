import java.util.Scanner;

public class Hinhchunhat 
{
        int cd,cr,S,P;
        void Nhap(Scanner sc)
        {   
            System.out.print("Xin moi nhap gia tri chieu dai");
            cd=sc.nextInt();
            System.out.print("Xin moi nhap chieu rong");
            cr=sc.nextInt();
        }
        void tinhdientich()
        {
            S=cd*cr;
            System.out.println("Dien tich hinh chu nhat la:"+S);
        }
        void tinhchuvi()
        {
            P=(cd+cr)*2;
            System.out.println("Chu vi hinh chu nhat la:"+P);
        }
        public Hinhchunhat()
        {   
        }

        public static void main(String[] args)
         {
                Scanner sc= new Scanner(System.in);
                System.out.println("XIn moi nhap gia tri vao");
                Hinhchunhat d= new Hinhchunhat();
                d.Nhap(sc);
                d.tinhdientich();
                d.tinhchuvi();
                sc.close();
        }
}