import java.util.Scanner;

public class Doanthang {
private Mau Maudiem1= new Mau();
private Mau Maudiem2= new Mau();

    public Doanthang(){}
    public Doanthang(Mau Maudiem1, Mau Maudiem2)
    {
        this.Maudiem1=new Mau(Maudiem1.x,Maudiem1.y,Maudiem1.mau);
        this.Maudiem2=new Mau(Maudiem2.x,Maudiem2.y,Maudiem2.mau);
    }
   public void Xuat()
   {
    System.out.print("Diem 1: ");
    Maudiem1.Xuat();
    System.out.print(" Diem 2: ");
    Maudiem2.Xuat();
   }
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int mau1,mau2,x1,y1,x2,y2;
     System.err.println("Xin moi nhap mau, x, y diem 1:");
     mau1=sc.nextInt();
     x1=sc.nextInt();
     y1=sc.nextInt();
     System.err.println("Xin moi nhap mau, x, y diem 2:");
     mau2=sc.nextInt();
     x2=sc.nextInt();
     y2=sc.nextInt();
     Mau m1= new Mau(x1, y1, mau1);
     Mau m2= new Mau(x2, y2, mau2);
     Doanthang dt= new Doanthang(m1, m2);
     dt.Xuat();
     sc.close();
    }
  
}
