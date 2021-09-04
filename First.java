package P40;

import java.util.Scanner;

public class First {
   public static void main(String arg[]) {
	   Scanner  a = new Scanner(System.in);
	   int born=a.nextInt();
	   int b=0;
	   for(int i=born;i<=born+100;i++) {
		   if(i%100!=0&&i%4==0) {b++;}
		   if(i%400==0) {b++;}
	   }
	   System.out.println("此人可以过"+b+"个闰年");
   }
}
