package arrange;

import java.util.Scanner;

public class fastSort {
public static void main(String arg[]) {
	Scanner sc =new Scanner(System.in);
	String str=sc.nextLine();
	String temp[]=str.split(" ");
	int []a=new int[temp.length];
	for(int i=0;i<temp.length;i++) {
		a[i]=Integer.parseInt(temp[i]);
	}
	for(int i=0;i<temp.length;i++) {
		System.out.println(a[i]);
	}
}
}
