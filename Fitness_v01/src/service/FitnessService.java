package service;

import java.util.Scanner;
import vo.Fitness;

public class FitnessService {
	// 멤버 변수로 선언
	Scanner keyin = new Scanner(System.in); // static : 클래스를 생성해야지만 사용하고자하는게 아니기 때문에 ..
	Fitness fitness; // null로 초기화

	public FitnessService() { // main에서 생성함

		String choice;

		while (true) {
			this.menu();
			choice = keyin.next();

			switch (choice) {
			case "1":
				this.create();
				break;
			case "2":
				this.read();
				break;
			case "3":
				this.update();
				break;
			case "4":
				this.delete();
				break;
			case "0":
				System.out.println("\n## 프로그램 종료합니다.");
				return;
			default:
				System.out.println("\n## 메뉴를 다시 선택해주세요");
				keyin.nextLine();
				break;
			}// end switch

		} // end while

	} // end main

	// 회원 등록
	private void create() {

		System.out.println("[ 회원 등록 ]\n");

		String name, id;
		double height, weight;

		System.out.print("> 아이디 : ");
		id = keyin.next();
		System.out.print("> 이  름 : ");
		name = keyin.next();
		System.out.print("> 키(cm) : ");
		height = keyin.nextDouble();
		System.out.print("> 몸무게(kg) : ");
		weight = keyin.nextDouble();

		fitness = new Fitness(id, name, height, weight);

		System.out.println("\n## 회원등록 완료 !\n");

	}

	// 회원 조회
	private void read() {
		System.out.println("[ 회원 정보 조회 ]");

		if (fitness == null) {
			System.out.println("\n## 등록된 회원이 없습니다.\n");
			return; // 자신을 호출한 곳으로 되돌아감 (단순 제어)
		}
		fitness.output();

	}

	// 회원 정보 수정
	private void update() {
		System.out.println("[ 회원 정보 수정 ]");

		if (fitness == null) {
			System.out.println("\n## 등록된 회원이 없습니다.\n");
			return;
		}

		double height, weight;

		System.out.print("> 키(cm) : ");
		height = keyin.nextDouble();
		System.out.print("> 몸무게(kg) : ");
		weight = keyin.nextDouble();

		fitness.setHeight(height);
		fitness.setWeight(weight);

		System.out.println("\n## 회원 정보 수정 왼료 !\n");

	}

	// 회원 탈퇴
	private void delete() {
		System.out.println("[ 회원 탈퇴 ]");

		if (fitness == null) {
			System.out.println("\n## 등록된 회원이 없습니다.\n");
			return;
		}

		System.out.print("\n> 정말로 탈퇴를 하시겠습니까? [y/n] : ");
		String confirm = keyin.next();

		if (!(confirm.equalsIgnoreCase("Y"))) {
			System.out.println("\n## 탈퇴가 취소되었습니다.\n");
			return;
		}

		fitness = null;
		System.out.println("\n## 탈퇴되었습니다.");
	}

	// menu
	public void menu() {
		System.out.println("===[DIMA 피트니스 회원관리]===");
		System.out.println("\t1) 회원 등록");
		System.out.println("\t2) 회원 조회");
		System.out.println("\t3) 회원 수정");
		System.out.println("\t4) 탈     퇴");
		System.out.println("\t0) 종     료");
		System.out.println("==============================");
		System.out.print("\t> 선택 : ");
	}
}
