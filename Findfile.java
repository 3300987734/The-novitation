package file;

import java.io.File;

public class Findfile {
	public static void main(String args[]) {
		//�����ж��Ƿ��ҵ��ļ�
		int boo=0;
		/*��Ҫ�����ļ������������Ĺؼ���
		 *����Һ��� CF ���Ƶ��ļ� 
		 */
		String str="CF";
		//�����ļ�����ָ��D��
		File a =new File("D:/");
		//��ȡD�������е��ļ��к�·��
		String FileNames[] = a.list();
		
		for(String s:FileNames) {
			//�ж��ַ���ָ����Ƿ����ļ�
			boolean b = (new File(a.getAbsoluteFile()+s)).isFile();
			boolean c = s.contains(str);
			//����ҵ������Ӧ���ļ����ӡ���
			if(b&&c) {
				System.out.println(s);
			}else {boo=1;}
		}
		if(boo==1) {
			System.out.println("δ��ѯ���κκ��� ��CF�����Ƶ��ļ�");
			}
	}

}
