import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Xin moi nhap so can kiem tra:");
        int c=sc.nextInt();

        if(c>0)
        System.out.println("Si nay la so nguyen duong:"+c);
        if(c==0)
        System.out.println("So nay la so 0:"+c);
        if(c<0)
        System.out.println("So nay la so nguyen am:"+c);

        sc.close();

    }
    
}
