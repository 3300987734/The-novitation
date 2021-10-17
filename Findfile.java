package file;

import java.io.File;

public class Findfile {
	public static void main(String args[]) {
		//用来判断是否找到文件
		int boo=0;
		/*需要查找文件的名字所含的关键字
		 *如查找含有 CF 名称的文件 
		 */
		String str="CF";
		//创建文件对象指向D盘
		File a =new File("D:/");
		//获取D盘里所有的文件夹和路径
		String FileNames[] = a.list();
		
		for(String s:FileNames) {
			//判断字符串指向的是否是文件
			boolean b = (new File(a.getAbsoluteFile()+s)).isFile();
			boolean c = s.contains(str);
			//如果找到了相对应的文件则打印输出
			if(b&&c) {
				System.out.println(s);
			}else {boo=1;}
		}
		if(boo==1) {
			System.out.println("未查询到任何含有 “CF”名称的文件");
			}
	}

}
