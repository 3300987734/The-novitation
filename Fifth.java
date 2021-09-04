package P40;

import java.util.Scanner;

public class Fifth {
	public static void main(String arg[]) {
	double a[]=new double[10];
	double c=0;
	System.out.println("请输入十个数据：");
	for(int i=0;i<10;i++) {
		Scanner b=new Scanner(System.in);
		a[i]=b.nextDouble();
		c+=a[i];
	}
	double arry=c/10.0;
	System.out.println("大于平均数的有：");
	for(int i=0;i<10;i++) {
		if(a[i]>arry) {System.out.println(a[i]);}
	}
	}
}
