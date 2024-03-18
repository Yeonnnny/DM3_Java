package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("song.txt");
			
			while(true) {
				int ch = fis.read(); // 맨 앞 글자만 읽어옴
				if(ch == -1) break;
				System.out.println((char)ch);
			}
			
			System.out.println("끝");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일을 열 수 없습니다.");
			e.printStackTrace();
		}finally{
			try {
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
