package P40;

import java.util.Scanner;

public class Fourth {
	public static void main(String arg[]) {
		Scanner str =new Scanner(System.in);
		String a=str.nextLine();
		char temp[] = new char[26];//����һ��char�ַ��� �Ա����������ظ����ַ�
		outCycel:
		for(int i=0;i<a.length();i++) {
			int b=1;
			int c=0;
			temp[i]=a.charAt(i);
			//�����ظ�����ĸ����
			for(int k=i-1;k>=0;k--) {
				if(temp[i]==temp[k]) {c=1;}
			}
			if(c==1) {continue outCycel;}
			innerCycel:
			//ͳ��ÿ����ĸ���ֵĴ���
			for(int j=i+1;j<a.length();j++) {
				if(temp[i]==a.charAt(j)) {b++;}
			}
			System.out.println("��ĸ"+temp[i]+"������"+b+"��");
		}
	}
}
