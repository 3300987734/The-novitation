package arrange;

public class insert {
	public static void main(String arg[]) {
		int a[]=new int[] {13,56,-10,89,65,45,32,15};
		//�ò��뷨��С��������
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("�����д�С��������Ϊ��");		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
