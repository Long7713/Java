import java.util.Scanner;

public class Bai7 {
    
    public static boolean check(int n)
    {
        if (n<2) return false;
        for(int x=2;x<=Math.sqrt(n);x++)
        {
            if(n%x==0) return false;

        }
        
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Xin moi nhap gia tri N:");
        int N=sc.nextInt();
        int A=0;
            for(int i=0;i<N;i++)
            {
                A=A+i;
            }
        System.out.println("Tong so N phan tu la:"+A);
        int Sumchan=0;
        int Sumle=0;
        for(int i=0;i<N;i++)
        {
            if(i%2==0)
            Sumchan=Sumchan+i;
            else
            Sumle=Sumle+i;
        }
        System.out.println("Tong cac so chan toi N la:"+Sumchan);

        System.out.println("Tong cac so le toi N la:"+Sumle);

        int Sumnguyento=0;
        
        for(int i=2;i<=N;i++)
        {
            if(check(i))
            {
                Sumnguyento+=i;
            }
        }
        System.out.println("\nTong cac so nguyen to <=N la:"+Sumnguyento);

        for(int i=2;i<=N;i++)
        {
            if(check(i))
            {
                System.out.println(" "+i);
            }
        }

        
        sc.close();
    }
}
