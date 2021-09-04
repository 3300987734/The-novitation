package P40;

import java.util.Scanner;

public class Fourth {
	public static void main(String arg[]) {
		Scanner str =new Scanner(System.in);
		String a=str.nextLine();
		char temp[] = new char[26];//创立一个char字符组 以便来检测二次重复的字符
		outCycel:
		for(int i=0;i<a.length();i++) {
			int b=1;
			int c=0;
			temp[i]=a.charAt(i);
			//二次重复的字母跳过
			for(int k=i-1;k>=0;k--) {
				if(temp[i]==temp[k]) {c=1;}
			}
			if(c==1) {continue outCycel;}
			innerCycel:
			//统计每个字母出现的次数
			for(int j=i+1;j<a.length();j++) {
				if(temp[i]==a.charAt(j)) {b++;}
			}
			System.out.println("字母"+temp[i]+"出现了"+b+"次");
		}
	}
}
