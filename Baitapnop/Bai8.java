import java.util.Scanner;

public class Bai8 {
    public static boolean check(int n)// Function check a prime number
    {   
        if(n<=2) return false;
        for(int i=0;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }      
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

            System.out.print("Xin moi nhap so tu nhien N:");
            int N=sc.nextInt();//A N elements need to calculate
            // Sử dụng ArrayList thay cho mảng để dễ dàng thêm/xóa phần tử
            java.util.ArrayList<Integer> arr = new java.util.ArrayList<>(N);
            System.out.print("Xin moi nhap gia tri tung phan tu:");
            int A=0;
            int chan=0;
            int le=0;
            int nguyento=0;
            for(int i=0;i<N;i++)//for loop run from start to the end
            {
                int value = sc.nextInt();
                arr.add(value);   
                A += value;
                if(i % 2 == 0)
                    chan += value;
                else
                    le += value;
                if(check(value))
                    nguyento += value;
                
            }
            System.out.println("Tong so tu nhien toiws so nguyen N la:"+A);//Show Sum 
            System.out.println("Tong so tu nhien chan toi so nguyen N la:"+chan);
            System.out.println("Tong so tu nhien le toi so nguyen to N la:"+le);
            System.out.println("Tong so nguyento toi so nguyen to N la:"+nguyento);

            int newvalue=sc.nextInt();
            arr.add(newvalue);


            System.out.print("Xin moi nhap vi gi hop le:");
            int k=sc.nextInt();

            if (k >= 0 && k < arr.size()) {
            arr.remove(k); // xóa phần tử tại vị trí k
         } 
            else {
            System.out.println("Vi tri k khong hop le!");
        }
        System.out.println("Mang sau khi xoa la:"+arr);

        System.out.print("Xin moi nhap 1 so x de kiem tra co trong mang a khong");
        int x=sc.nextInt();
        int f=-1;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)==x)
            {
                f=i;
            }
        }
        if(f==-1)
        System.out.println("Gia tri can tim khong nam trong mang");
        else
        System.out.println("Gia tri can tim nam o:"+f);


        sc.close();
    }
   
}
