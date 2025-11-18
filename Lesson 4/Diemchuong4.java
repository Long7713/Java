import java.util.Scanner;
public class Diemchuong4 {
        public int x,y;

    public Diemchuong4(int x,int y)
    {       
        this.x=x;
        this.y=y;
    }   
    public Diemchuong4(){}
    public void Xuat()
    {
    System.out.print("Diem "+x+":"+y);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      
        int x,y;
        System.out.print("Nhap toa do x: ");
        x = sc.nextInt();
        System.out.print("Nhap toa do y: ");
        y = sc.nextInt(); 
        Diemchuong4 z=new Diemchuong4(x,y);
            z.Xuat();
        sc.close();
    } 
       
    }

