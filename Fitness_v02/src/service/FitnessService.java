package service;

import java.util.Scanner;
import vo.Fitness;

public class FitnessService {
	// 멤버 변수로 선언
	Scanner keyin = new Scanner(System.in); // static : 클래스를 생성해야지만 사용하고자하는게 아니기 때문에 ..
	Fitness[] members = new Fitness[100]; // 최대 회원수 100명
	int size; // 현재 회원수

	public FitnessService() { // main에서 생성함

		String choice;

		while (true) {
			menu();
			choice = keyin.next();

			switch (choice) {
			case "1":
				create();
				break;
			case "2":
				read(); // search
				break;
			case "3":
				update();
				break;
			case "4":
				delete();
				break;
			case "5":
				printAll();
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


	/**
	 * 회원 등록 회원 가입을 처리하는 메소드
	 * 
	 * @param : 없음
	 * @return : 없음
	 */
	private void create() {

		System.out.println("[ 회원 등록 ]\n");

		String name, id;
		double height, weight;

		if (size >= members.length) {
			System.out.println("## 회원 가입 가능 인원이 초과되었습니다.\n## 다음 기회에 ! \n");
			return;
		}

		while (true) {
			System.out.print("> 아이디 : ");
			id = keyin.next();
			int searchIndex = search(id); // -1이면 중복 X
			if(searchIndex==-1){
				System.out.println("## 사용 가능한 아이디입니다.");
				break;				
			}
			System.out.println("## 동일한 아이디가 이미 존재합니다. 다시 입력해주세요 ##");
		}
			
		System.out.print("> 이  름 : ");
		name = keyin.next();
		System.out.print("> 키(cm) : ");
		height = keyin.nextDouble();
		System.out.print("> 몸무게(kg) : ");
		weight = keyin.nextDouble();

		members[size] = new Fitness(id, name, height, weight);
		++size;

		System.out.println("\n## 회원등록 완료 !\n");

	}

	/**
	 * 회원 조회 회원 아이디를 이용하여 회원 정보를 조회하는 메소드
	 * 
	 * @param : 없음
	 * @return : 없음
	 */
	private void read() {
		System.out.println("[ 회원 정보 조회 ]");

		if (size == 0) {
			System.out.println("\n## 등록된 회원이 없습니다.\n");
			return;
		}

		System.out.print("> 아이디 입력 : ");
		String searchID = keyin.next();

		int searchIndex = search(searchID);
		// -1이 반환되면 에러메세지 출력 후 return
		// 아니면 멤버 정보 출력
		if (searchIndex == -1) {
			System.out.println("\n## 아이디가 존재하지 않습니다.\n## 메뉴로 돌아가겠습니다.\n");
			return;
		}
		System.out.println();
		members[searchIndex].output();
		System.out.println();
	}

	/**
	 * search() 메소드 : 파라미터로 전달받은 아이디를 객체 배열에서 검색 위치값을 반환하는 메소드
	 * 
	 * @param searchID : 검색하기 위한 아이디
	 * @return : 검색한 아이디의 위치 정보
	 */
	private int search(String searchID) {
		int searchIndex = -1;
		for (int i = 0; i < size; i++) {
			if (members[i].getId().equals(searchID)) {
				searchIndex = i;
				break;
			}
		}
		return searchIndex;
	}

	/**
	 * 회원 정보 수정 회원의 정보를 찾아서 키와 몸무게를 다시 입력 받아 그 두개의 정보를 수정
	 * 
	 * @param : 없음
	 * @return : 없음
	 */
	private void update() {
		System.out.println("[ 회원 정보 수정 ]");

		if (size == 0) {
			System.out.println("\n## 등록된 회원이 없습니다.\n");
			return;
		}

		double height, weight;
		String searchID;

		System.out.print("> 수정할 아이디 입력 : ");
		searchID = keyin.next();

		int searchIndex = search(searchID);
		if (searchIndex == -1) {
			System.out.println("\n## 아이디가 존재하지 않습니다.\n## 메뉴로 돌아가겠습니다.\n");
			return;
		}

		// 정보 출력해주기
		System.out.println();
		members[searchIndex].output();
		System.out.println();

		System.out.print("> 키(cm) : ");
		height = keyin.nextDouble();
		System.out.print("> 몸무게(kg) : ");
		weight = keyin.nextDouble();

		members[searchIndex].setHeight(height);
		members[searchIndex].setWeight(weight);

		System.out.println("\n## 회원 정보 수정 왼료 !\n");

	}


	/**
	 * 
	 * 회원 아이디를 입력받아 탈퇴 여부 확인 후 진행
	 * @param : 없음
	 * @return : 없음
	 */
	private void delete() {
		System.out.println("[ 회원 탈퇴 ]");

		if (size == 0) {
			System.out.println("\n## 등록된 회원이 없습니다.\n");
			return;
		}

		System.out.print("> 아이디 입력 : ");
		String searchID = keyin.next();

		int searchIndex = search(searchID);

		if (searchIndex == -1) {
			System.out.println("\n## 아이디가 존재하지 않습니다.\n## 메뉴로 돌아가겠습니다.\n");
			return;
		}

		System.out.print("\n> 정말로 탈퇴를 하시겠습니까? [y/n] : ");
		String confirm = keyin.next();

		if (!(confirm.equalsIgnoreCase("Y"))) {
			System.out.println("\n## 탈퇴가 취소되었습니다.\n");
			return;
		}

		// 삭제 처리
		for (int i = searchIndex; i < size - 1; i++) {
			members[i] = members[i + 1];
		}
		--size;

		System.out.println("\n## 탈퇴되었습니다.\n");
	}
	
	
	
	// 5) 모든 회원 정보 출력
	private void printAll() {
		System.out.println("[전체 회원 정보 출력]");
		
		if (size == 0) {
			System.out.println("\n## 등록된 회원이 없습니다.\n");
			return;
		}
		
		System.out.printf("%n등록 회원수 : %d%n",size);
		for(int i=0;i<size;i++) {
			System.out.printf("[%03d] ",i);
			members[i].output();
		}
		
		System.out.println("\n## 출력 완료 \n");
	}
	
	
	// menu
	public void menu() {
		System.out.println("===[DIMA 피트니스 회원관리]===");
		System.out.println("\t1) 회원 등록");
		System.out.println("\t2) 회원 조회");
		System.out.println("\t3) 회원 수정");
		System.out.println("\t4) 탈     퇴");
		System.out.println("\t5) 전체 조회");
		System.out.println("\t0) 종     료");
		System.out.println("==============================");
		System.out.print("\t> 선택 : ");
	}
}
