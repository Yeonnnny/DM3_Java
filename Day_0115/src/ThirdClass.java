
public class ThirdClass {
	public static void main(String args[]) {
		
		// 정수 타입

		byte b = -128 ;  // 초기화할 때는 int 대입 가능
//		b = b + 1;  //  int 값을 작은 int보다 작은 타입인 short애 넣지 못함
		b = -128 + 1 ;  

		short s = 32767;
		int i = 10;
		long l = 1004; //1004L
		long l2 = 1004L; // long type은 L붙여도 됨
		
		
		// char 
		char ch ='a';
		ch = (char)(ch+1); // 강제 형 변환 (Casting)
		//ch = ch+1;       // 자동 형 변환 (Promotion) 연산의 결과는 int형이 됨 (98) : int를 char에 넣으려고 했기 때문에 에러발생 
		// 큰 데이터는 작은 변수에 넣을 수 없음
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(l2);
		System.out.println(ch);
		
		
		
	}
}
