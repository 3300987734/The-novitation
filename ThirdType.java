package SeekMaxs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Vehicle implements Comparable<Vehicle>{
	private int speed;
	private String color;
	
	//��ȡVehicle����ٶ�
	public int getSpeed() {
		return speed;
	}
	
	//����Vehicle����ٶ�
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	//��ȡVehicle����ɫ
	public String getColor() {
		return color;
	}
	
	//����Vehicle����ɫ
	public void setColor(String color) {
		this.color=color;
	}
	
	//�Ƚ�Vehicle�ٶȣ����ڷ�����������С�ڷ��ظ�����
	public int compareTo(Vehicle v) {
		return this.speed-v.speed;
	}
	
	public Vehicle(int speed,String color) {
		this.speed = speed;
		this.color = color;
	}
}

class Bus extends Vehicle{
	private int price;
	
	//��ȡBus�ļ۸�
	public int getPrice() {
		return price;
	}
	
	//����Bus�ļ۸�
	public void setPrice(int price) {
		this.price = price;
	}
	
	//ͬʱ����Bus���ٶȣ���ɫ���۸�����
	public Bus(int speed, String color, int price) {
		super(speed,color);
		this.price=price;
	}
} 

public class ThirdType {
	//����Сֵ
	public static <T extends Comparable<? super T>>  T min(List<T> list){
		T t=list.get(0);
		for(int i=1;i<list.size();i++) {
		if(t.compareTo(list.get(i))>0) {
			t=list.get(i);
		}
		}
		return t;
	}
	
	//�ȽϷ���
	public static <T extends Comparable<? super T>> List<T> max(List<T> list,int m,List<T> list1) {
		T t;
		T min=min(list1);
		for(int i=m;i<list.size();i++) {
			t =list.get(i);
			if(min.compareTo(list.get(i))<0) {
				list1.remove(min);
				list1.add(t);
				min=min(list1);
			}
		}
		return list1;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//jΪ���ɶ��ٸ������
		int j = (int)1e+8;
		//kΪѡ�����ٸ����ֵ
		int k=50;
		List<Integer> list1=new ArrayList<Integer>(k);
		Random a =new Random();
		
		for(int i=1;i<j;i++) {
			 list.add(a.nextInt());
		}
		
		for(int i=0;i<k;i++) {
			list1.add(list.get(i));
		}
		
		long Time1 = System.currentTimeMillis();
		
		max(list,k,list1);
		
		long Time2 = System.currentTimeMillis();
		
		//Ϊ�˸��ÿ�һ��
		List<Integer> list2=new ArrayList<Integer>(k);
		Integer min;
		for(int i=0;i<k;i++) {
			min=min(list1);
			list2.add(min);
			list1.remove(min);

		}
		
		System.out.println("list "+j+"��������"+"����"+k+"����ֵ�ֱ�Ϊ��\n");
		for(int i=k-1;i>=0;i--) {
		System.out.println(list2.get(i));
		}
		System.out.println("��ʱΪ��"+(Time2-Time1)+"ms");

	}
}
