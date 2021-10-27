package SeekMaxs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Vehicle implements Comparable<Vehicle>{
	private int speed;
	private String color;
	
	//获取Vehicle最大速度
	public int getSpeed() {
		return speed;
	}
	
	//输入Vehicle最大速度
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	//获取Vehicle的颜色
	public String getColor() {
		return color;
	}
	
	//输入Vehicle的颜色
	public void setColor(String color) {
		this.color=color;
	}
	
	//比较Vehicle速度，大于返回正整数，小于返回负整数
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
	
	//获取Bus的价格
	public int getPrice() {
		return price;
	}
	
	//输入Bus的价格
	public void setPrice(int price) {
		this.price = price;
	}
	
	//同时输入Bus的速度，颜色，价格属性
	public Bus(int speed, String color, int price) {
		super(speed,color);
		this.price=price;
	}
} 

public class SecondType {
	//比较方法
	public static <T extends Comparable<? super T>> List<T> max(List<T> list,int k,List<T> list1) {
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).compareTo(list1.get(0))>0) {
				list1.add(0,list.get(i));
				continue;
			}
				for(int j=k-1;j>0;j--) {
					if(list.get(i).compareTo(list1.get(j))>0 && list.get(i).compareTo(list1.get(j-1))<0) {
						list1.add(j, list.get(i));
						break;
					}
					
				}
		}
		return list1;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//j为生成多少个随机数
		int j = (int)1e+8;
		//k为选出多少个最大值
		int k=50;
		List<Integer> list1=new ArrayList<Integer>(k);
		Random a =new Random();
		
		for(int i=1;i<j;i++) {
			 list.add(a.nextInt());
		}
		
		for(int i=0;i<k;i++) {
			list1.add(list.get(0));
		}
		
		long Time1 = System.currentTimeMillis();
		
		max(list,k,list1);
		
		long Time2 = System.currentTimeMillis();
		
		System.out.println("list "+j+"个数据中"+"最大的"+k+"个数值分别为：\n");
		for(int i=0;i<k;i++) {
		System.out.println(list1.get(i));
		}
		System.out.println("用时为："+(Time2-Time1)+"ms");

	}
}
