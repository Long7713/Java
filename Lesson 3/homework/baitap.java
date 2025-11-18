import java.util.Scanner;

public class baitap {
            static   class Ngaythangnam
            {       private int Ngay,Thang,Nam;
                    public 
                        Ngaythangnam()
                        {   
                        }
                        Ngaythangnam(int a, int b,int c)
                        {   Ngay=a;
                            Thang=b;
                            Nam=c;
                        }   
               public void Nhap(Scanner sc)
                    {   

                            System.out.println("Xin moi nhap ngay");
                            this.Ngay=sc.nextInt();
                            System.out.println("Xin moi nhap thang");
                            this.Thang=sc.nextInt();
                            System.out.println("Xin moi nhap nam");
                            this.Nam=sc.nextInt();
                            
                    }
                    void Xuat(){
                        System.out.println("Ngaythangnam la:"+Ngay+"/"+Thang+"/"+Nam);
                            }
             }
      static  class Giophutgiay
            {   
                        private int Gio,phut,giay;
                        public
                            Giophutgiay(){}
                            Giophutgiay(int x,int y, int z)
                                {   Gio=x;  
                                    phut=y; 
                                    giay=z;
                                }
                        public void Nhap(Scanner sc)
                        {   
                                
                                System.out.println("Xin moi nhap gio");
                                this.Gio=sc.nextInt();
                                System.out.println("Xin moi nhap phut");
                                this.phut=sc.nextInt();
                                System.out.println("Xin moi nhap giay");
                                this.giay=sc.nextInt();
                                

                        }
                         void Xuat(){
                        System.out.println("Thoi gian la:"+Gio+":"+phut+":"+giay);
                            }


            }
          public  class Main
                {   
                            public static void main(String[] args) 
                        {       //không có tham số
                                    Scanner sc=new Scanner(System.in);
                                Ngaythangnam date1=new Ngaythangnam();    
                                Giophutgiay time1= new Giophutgiay();
                                date1.Nhap(sc);
                                date1.Xuat();
                                time1.Nhap(sc);
                                time1.Xuat();
                                Ngaythangnam date2=new Ngaythangnam(4,4,2006);
                                Giophutgiay time2=new Giophutgiay(7,7,13);
                                date2.Xuat();
                                time2.Xuat();
                                sc.close();
                            }
                }
            }
      
