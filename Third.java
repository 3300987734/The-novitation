package P40;

import java.util.Scanner;

public class Third {
  public static void main(String arg[]) {
	  Scanner a=new Scanner(System.in);
	  Scanner b=new Scanner(System.in);
	  int x=a.nextInt(),y=b.nextInt();
	  if(x<y) {
		  int temp=x;
		  x=y;
		  y=temp;
	  }
	  int best=y;
	  while(x%y!=0) {
		  x=x%y;
		  if(x==0) {best=y;break;}
		  y=y%x;
		  if(y==0) {best=x;break;}
	  }
	  System.out.println("这两个最大的公约数是；"+best);
   }
}
