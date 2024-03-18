package main;

import service.FitnessService;

public class FitnessMain {
	public static void main(String[] args) {
		new FitnessService(); 
		// FitnessService service = 하지 않는 이유? 
		// service 클래스에서 메소드나 변수를 가져와서 작업할게 없기 때문에,, 알아서 자기들끼리 호출하고 사용하기 때문에
		
	}
}
