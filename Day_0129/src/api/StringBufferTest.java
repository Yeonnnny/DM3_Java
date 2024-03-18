package api;


// import java.lang 페키지 내부의 클래스는 import 하지 않아도 
// 자동 import
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer buff1 = new StringBuffer();
		StringBuffer buff2 = new StringBuffer("울릉도");
		StringBuffer buff3 = new StringBuffer(100);
		
		System.out.println("buff1의 용량 : "+buff1.capacity());
		System.out.println("buff2의 용량 : "+buff2.capacity());
		System.out.println("buff3의 용량 : "+buff3.capacity());
		
		buff2.append(" 동남쪽")
			.append(" 뱃길따라 ")
			.append(200)
			.append("리")
			.append(" 외로운 섬하나 새들의 고향")
			.append(" 그누가 아무리 자기네 땅이라고 우겨도")
			.append(" 독도는 우리 땅");
		
		System.out.println(buff2);
		System.out.println("buff2의 용량 : "+buff2.capacity());
		System.out.println("buff2의 길이 : "+buff2.length()); // 실제 글자 개수
		
		buff2.trimToSize();
		System.out.println("buff2의 용량 : "+buff2.capacity());
		System.out.println("buff2의 길이 : "+buff2.length()); // 실제 글자 개수

		String str = buff2.toString();
		System.out.println(str);
		
	}

}
