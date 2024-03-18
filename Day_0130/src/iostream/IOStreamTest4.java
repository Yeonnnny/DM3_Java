package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamTest4 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("eunwoo.jpg");
			fos = new FileOutputStream("eunwoo_target.jpg");
			
			while(true) {
				int ch = fis.read(); // 맨 앞 글자만 읽어옴
				if(ch == -1) break;
				fos.write(ch);
			}
			
			System.out.println("복사 완료");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일을 열 수 없습니다.");
			e.printStackTrace();
		}finally{
			try {
				if(fis != null) fis.close(); // 읽는 것은 close 안해도 원본이 상하지 않음
				if(fos != null) fos.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
