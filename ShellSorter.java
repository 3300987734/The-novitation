package arrange;

public class ShellSorter {
	public static void main(String arg[]) {
		int a[]=new int[] {13,56,-10,89,65,45,32,15};
		//用希尔排序从小到大
		for(int i=a.length/2;i>0;i/=2) {
		   for(int j=i;j<a.length;j++) {
			if(j-i>=0&&a[j-i]>a[j]) {
				int temp=a[j];
				a[j]=a[j-i];
				a[j-i]=temp;
				j=j-i;
			}
			}
		}
		
		System.out.println("该数列从小到大排列为：");		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}