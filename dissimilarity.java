package Stringbuff_And_String;

public class dissimilarity {
	public static void main(String args[]) {
		double j= 1e+4;
		String a1 ="a";
		StringBuffer a2 =new StringBuffer("a");
		long time1 = System.currentTimeMillis();
		for(int i=0;i<j;i++) {
			a1=a1+"a";
		}
		long time2 = System.currentTimeMillis();
		System.out.println("String�ۼ�"+j+"���ַ�����ʱ��Ϊ��"+(time2-time1)+"ms");
		
		long Time1 = System.currentTimeMillis();
		for(int i=0;i<j;i++) {
			a2=a2.append("a");
		}
		long Time2 = System.currentTimeMillis();
		System.out.println("StringBuffer�ۼ�"+j+"���ַ�����ʱ��Ϊ��"+(Time2-Time1)+"ms");
	}

}
