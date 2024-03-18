package api;

import java.util.Scanner;

public class JuminIDValid2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String juminId = null;
		String gender = null, year,month,day;
		int age=0;
		
		System.out.print("주민번호 입력 : ");
		juminId = scanner.next();
		
		String[] tmp = juminId.split("-");
		
		
		if(!(juminId.length()==14)){
			System.out.println("올바르지 않은 주민번호입니다.");
			return;
		}
		
		if(!(isNumeric(tmp[0])&&isNumeric(tmp[1]))) {
			System.out.println("올바르지 않은 주민번호입니다.");
			return;
		}
		
		if(!(codeCheck(juminId))){
			System.out.println("올바르지 않은 주민번호입니다.");
			return;
		}
		if(!(isValid(juminId))){
			System.out.println("올바르지 않은 주민번호입니다.");
			return;
		}
		
		gender = genderCheck(juminId);
		
		year = birthyear(juminId);
		month = juminId.substring(2,4);
		day = juminId.substring(4,6);
		age = 2024-Integer.parseInt(year);
		
		System.out.printf("당신은 %s년 %s월 %s일생. 나이는 %d세 %s입니다.%n%n", year,month,day,age,gender);			
		
		
	}// end main
	
	public static boolean isNumeric(String temp) {
		for(int i =0;i<temp.length();i++) {
			if((temp.charAt(i)<'0')||(temp.charAt(i)>'9')) return false;
		}
		return true;
	}
	
	public static boolean codeCheck(String juminId) {
		int total=0;
		int temp=0;
		int value=2;
		
		for(int i =0; i< juminId.length()-1;i++) {
			if(i==6)continue;
			temp=juminId.charAt(i)-'0';
			total += (value*temp);
			++value;
			if(value==10) value=2;
		}
		
		int digit = juminId.charAt(juminId.length()-1)-'0';                                                                                                     
		int valid = 11-(total%11);
		if (valid>9) valid = valid%10;
		
		
		if(digit==valid)
			return true;
		
		return false;
	}
	
	public static boolean isValid(String juminId) {
		boolean flag1= false;
		boolean flag2= false;
		char gender = juminId.charAt(7);
		
		if(juminId.charAt(6) == '-') flag1=true;
		
		if (gender>='1'&& gender<='4') flag2=true;
		else flag2=false;
		
		return flag1 && flag2;
	}
	
	
	private static String genderCheck(String juminId) {
		if((juminId.charAt(7)-'0')%2==0) 
			return "여자";
		return "남자";
	}
	
	private static String birthyear(String juminId) {
		String birth = null;
		
		char gender = juminId.charAt(7);
		if(gender=='1'|| gender=='2')
			birth="19";
		else
			birth="20";
		
		return birth+juminId.substring(0,2);
	}

	
}
