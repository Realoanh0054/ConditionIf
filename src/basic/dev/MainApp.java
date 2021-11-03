package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Bai9.1
		
		 System.out.println("Nhap m");
		 int m = sc.nextInt();
		 if (m > 0) { 
			 System.out.println("m la so nguyen duong");
		 }
		 else if (m == 0) {
			 System.out.println("m la so co gia tri bang 0");
		 }
		 else if (m < 0){
			 System.out.println("m la so nguyen am"); 
		 }
		 //Bai9.2
		 System.out.println("Nhap n");
		 int n = sc.nextInt();
		 if (n % 3 == 0)  System.out.println(n + " Chia het cho 3");
		 if (n % 5== 0)  System.out.println(n + " Chia het cho 5");
		 
		 //bai9.3
		 System.out.println("Nhap vao thang trong nam n= ");
		 n =sc.nextInt();
		 
		 if(n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12 )
			 System.out.println("Thang co 31 ngay");
		 else if( n == 4 || n == 6 || n == 9 || n == 11  )
			 System.out.println("Thang co 30 ngay");
		 else if( n == 2 )
			 System.out.println("Thang co 28 ngay");
		 //bai9.4 GIAI PHUONG TRINH BAC 2 : ax^2 + bx + c = 0 
		 
		 System.out.println("Nhap he so bac 2, a = ");
		 float a = sc.nextFloat();
		 System.out.println("Nhap he so bac 1, b = ");
		 float b = sc.nextFloat();
		 System.out.println("Nhap he so tu do, c = ");
		 float c = sc.nextFloat();
		 
		 if (a == 0) 
		 	{
			 if (b == 0)
			 {
				 if (c == 0)
					 System.out.println("Phuong trinh co vo so nghiem");
				 else 
					 System.out.println("Phuong trinh vo nghiem");
			 
			 }
			 else 
				 System.out.println("Phuong trinh co 1 nghiem: " + "x = " + (-c / b));
		 }
		 else
		 {
		 //tinh delta
		 float delta = b*b - 4*a*c;
		 float x1;
		 float x2;
		 //tinh nghiem phuong trinh
		 if (delta <0) System.out.println("Phuong trinh vo nghiem ");
		 else if (delta == 0) {
		 x1 = (-b / (2 * a));
		 System.out.println("Phuong trinh co nghiem kep : " + "x1 = x2 = " +x1);
		 }
		 else 
		 	{
			 x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
			 x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
			 System.out.println("Phuong trinh co 2 nghiem la: " + "x1 = " + x1 + " va x2= " + x2);
		 	}
		 }
		 
		 //Bai9.5
         System.out.println("Nhap g:");
         int g = sc.nextInt();
         System.out.println("Nhap h:");
         int h = sc.nextInt();
         System.out.println("Nhap u:");
         int u = sc.nextInt();
         if ((g + h) > u && (h + u) > g && (g + u) > h)
         {
          System.out.println("Day la mot tam giac");
          System.out.println("g,h,u la ba canh cua mot tam giac"); 
          }
		 
	}

}
