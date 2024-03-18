package myexception;

import java.util.Scanner;

public class MemberExceptionTest {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		String uid;
		
		while(true) {
			System.out.print("아이디 입력 (2~5자 이내) : ");
			uid = scanner.next();
			try {
				if(uid.length() <2 || uid.length()>5) {
					throw new MemberException("※※ 아이디를 2~5자로 입력하세요 ※※");
				}else {
					System.out.println("# 올바른 형식입니다.");
					break;
				}
				
			} catch (MemberException e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
				continue;
			}
			
		}
	}

}
