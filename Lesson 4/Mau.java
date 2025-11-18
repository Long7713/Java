import java.util.Scanner;

class Mau extends Diemchuong4{
      public int mau;
        public Mau(int x, int y, int mau)
        {           
            super(x, y);
            this.mau=mau;
        }
public Mau(){}
        public void Xuat()
            {
              System.out.print(+x+":"+y+":"+mau);
            }
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int mau,x,y;
        System.err.println("Xin moi nhap mau:");
        mau=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        Mau m= new Mau(x, y, mau);
        m.Xuat();
        sc.close();
      }
        
}