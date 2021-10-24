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

public class FirstType {
	//�ȽϷ���
	public static <T extends Comparable<? super T>> List<T> max(List<T> list,int m,List<T> list1) {
		//max������ǣ������Ƴ�ѡ�е�list��һ��ֵ
		int max =0;

		for(int i=0;i<m;i++) {
			T t = list.get(0);
			for(int j=0;j<list.size();j++) {
				//���÷������Ƚ�
				if(t.compareTo(list.get(j))<0) {
					t=list.get(j);
					max=j;
				}
			}
			//�ó����ֵ������ֵ��list1
			list1.add(t);
			//�Ƴ�list��ѡ�е�ֵ����ֹ�ظ�ѡ��ͬһ��
			list.remove(max);
		}
		return list1;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//jΪ���ɶ��ٸ������
		int j = (int)1e+7;
		//kΪѡ�����ٸ����ֵ
		int k=100;
		List<Integer> list1=new ArrayList<Integer>(k);
		Random a =new Random();
		for(int i=1;i<j;i++) {
			 list.add(a.nextInt());
		}
		long Time1 = System.currentTimeMillis();
		max(list,k,list1);
		long Time2 = System.currentTimeMillis();
		System.out.println("list "+j+"��������"+"����"+k+"����ֵ�ֱ�Ϊ��\n");
		for(int i=0;i<k;i++) {
		System.out.println(list1.get(i));
		}
		System.out.println("��ʱΪ��"+(Time2-Time1)+"ms");

	}
}
