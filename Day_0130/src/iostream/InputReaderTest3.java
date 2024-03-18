package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputReaderTest3 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("song.txt");
			
			while(true) {
				int ch = fr.read(); // 맨 앞 글자만 읽어옴
				if(ch == -1) break;
				System.out.print((char)ch);
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
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
