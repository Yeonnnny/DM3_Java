package api;

public class WrapperTest {

	public static void main(String[] args) {
		
		// wrapper class는 primitive data type을 객체화 시킨 클래스를 일컫는 용어
		// Byte, Short, Integer, Long, Character
		// Float, Double
		// Boolean
		
		//Integer i1 = new Integer(1); // 17버전에서는 deprecated 되었음
		Integer i1 = 1; // 기본자료형이 객체로 변경 (Auto Boxing)
		Integer i2 = 12;
		int result = i1+i2; // 객체가 자동으로 기본자료형으로 변경 (Auto Unboxing)
		System.out.println(result); 
		
		String a = "45";
		String b = "2.5";
		
		System.out.println(Integer.parseInt(a)* Double.parseDouble(b));
		System.out.println(Integer.parseInt(a)+ Double.parseDouble(b));
		
	}

}
