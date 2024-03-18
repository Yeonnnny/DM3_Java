package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest3 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		String data = "abcdefghijklmn";
		
		try {
			fos = new FileOutputStream("target.txt");
			
			for(int i =0; i<data.length();i++) {
				
				fos.write(data.charAt(i));
			}
			System.out.println("저장완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fos!=null) fos.close();
			} catch (IOException e2) {
				e2.printStackTrace();				
			}
		}
		
		
	}

}
