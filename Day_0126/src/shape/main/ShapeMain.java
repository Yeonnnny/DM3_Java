package shape.main;

import shape.vo.MyCircle;
import shape.vo.MyPoint;
import shape.vo.MyRectangle;
import shape.vo.MyTriangle;

public class ShapeMain {

	public static void main(String[] args) {
		
		// 부모의 레퍼런스 변수가 자식객체의 위치값을 갖도록 함
		MyPoint p = new MyCircle(20);  // 다운캐스팅 (부모타입을 자식으로 변환)
		p.temp();  // circle꺼
		
		MyCircle tt = new MyCircle();		
		MyPoint tmp = ((MyPoint)tt);   // 업캐스팅 (자식을 부모로 변환)
		
		((MyPoint)p).temp(); 		   // p를 캐스팅 후에 불러옴
		
		//is-a관계에서 사용할 수 있는 연산자 
		// 변수 instanceof 타입
		Object obj = new Object();
		System.out.println(p instanceof MyPoint);  //true
		System.out.println(p instanceof MyCircle); //true
		System.out.println(tt instanceof MyPoint); //true : 자식클래스는 부모클래스이고 자식클래스임 
		System.out.println(obj instanceof MyPoint); //false : 부모클래스는 자식클래스가 아님 
		
		
		System.out.println(p.calcArea()); // 동적 바인딩 : 부모의 메소드가 abstract일 때 발생. 자식의 메소드로 이동
		System.out.println(p);
	
		MyPoint p1 = new MyTriangle();
		p1.temp();
		System.out.println(p1);
		
		MyPoint p2 = new MyRectangle(); // MyRectangle에 temp()가 없으면 부모의 temp() 호출
		p2.temp();
		System.out.println(p2);
		
		System.out.println();
		
		
		
		MyCircle c1 = new MyCircle(5);
		c1.setX(10);
		c1.setY(20);
		System.out.println(c1);
		
		
		MyTriangle t1 = new MyTriangle(2,4);
		t1.setX(5);
		t1.setY(5);
		System.out.println(t1);

		MyRectangle r1 = new MyRectangle(2,4);
		r1.setX(7);
		r1.setY(8);
		System.out.println(r1);
		
	}

}
