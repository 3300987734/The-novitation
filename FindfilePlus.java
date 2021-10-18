package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FindfilePlus {

	public static void main(String args[]) {
		File a = new File("D:");
		String Findname="cf";
		FileInputStream b =null;
		try {
			b = new FileInputStream(a);
			while(b.available()>0) {
				if((b.toString()).contains(Findname)) {
				System.out.println((char) b.read());
				}
			}
			} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			if(b!= null) {
				try {
					b.close();
				} catch (IOException ex){
					ex.printStackTrace();
				}
				b = null;
			}
		}
	}
}
