package P40;

public class Sixth {
    public static void main(String arg[]) {
    	int a[]=new int[20];
    	int t=0,max=77,min=459;
    	double arry=0;
    	for(int i=0;i<20;i++) {
    		a[i]=(int)(77+Math.random()*459);
    		if(a[i]>max) {max=a[i];}
    		if(a[i]<min) {min=a[i];}
    		t+=a[i];
    	}
    	arry=t/20.0;
    	System.out.println("数组中最大值是；"+max);
    	System.out.println("数组中最小值是："+min);
    	System.out.println("数组的平均值是："+arry);
    	System.out.println("数组的各个元素和是："+t);
    }
}
