// 하나의 파일안에 클래스가 여러개 있는 경우 public은 하나의 class에만 지정될 수 있음
// ** main을 가진 class만 public을 가질 수 있고, public을 가진 클래스만 파일명이 될 수 있음
// 하나의 파일안에는 하나의 클래스를 써야함 ! test용도인 경우 제외하고

class Sample{
	public int s1; // new Sample();에 의해 메모리에 올라감, 객체가 생성된 만큼 s1이 메모리에 만들어짐
	public static int s2;  // static 있는 변수 : 클래스 변수 , new 한번하면 여러개 생성되어도 메모리에는 딱 하나의 s2만 존재, 공통으로 사용함
}


public class StaticTest01 {

	public static void main(String[] args) {
		
//		System.out.println(s1); // s1 : 반드시 객체 생성 후 사용해야 함
//		System.out.println(Sample.s2); // s2 : 객체 생성하지 않아도 사용가능. "클래스명.변수"
		Sample.s2 += 1;
		System.out.println(Sample.s2); // 1
		
		Sample temp = new Sample();
		Sample temp2 = new Sample();
		temp.s1+=1;
		System.out.println(temp.s1); // 1
		
		//===============================
		Sample.s2 += 1;
		System.out.println(Sample.s2); // 2
		
		temp = new Sample();
		temp.s1+=1;
		System.out.println(temp.s1); // 1
		
	}

}
