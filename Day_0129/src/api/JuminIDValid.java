package api;

import java.util.Scanner;

public class JuminIDValid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String birth, back;
		String id, sex;
		int age;

		while(true) {
			System.out.print("주민번호 입력하세요 (종료 : 0): ");
			id = scanner.next();
			if (id.equals("0")) {
				System.out.println("종료합니다.");
				return;
			}
			if ((id.length()==14) && (id.charAt(6) == '-')&&validID(id)){
				birth = id.substring(0,6);
				back = id.substring(7);
				if((isNumeric(birth)&&isNumeric(back))) {
					sex = index7(back);
					age = calAge(birth, back);
					String year = (back.charAt(0)>='1'&&back.charAt(0)<='2')? "19"+birth.substring(0,2):"20"+birth.substring(0,2);
					String month = birth.substring(2,4);
					String day = birth.substring(4,6);
					System.out.printf("%s년 %s월 %s일생 %s 나이 %d살입니다.%n%n", year,month,day,sex,age);			
				}
			}		
		}
		
		
		
	}
	public static boolean validID(String id) {
		boolean result =false;
		String num = id.substring(0,6)+id.substring(7);
		System.out.println(num);
		int sum=0;
		
		
		for(int j=0;j<=num.length()-1;j++) {
			int n = num.charAt(j)-'0';
			if(j>=8) {
				sum+=((j-6)*n);				
			}else {
				sum+=((j+2)*n);				
			}
		}
		System.out.println(sum);
		int lastnum = num.charAt(num.length()-1)-'0';
		System.out.println(sum%11);
		if (11-(sum%11)==lastnum) 
			result =  true;	
		
		return result;
	}
	
	
	public static String index7(String back) {
		String sex=null;
		if (back.charAt(0)>='1' && back.charAt(0)<='4') {
			if ((back.charAt(0)=='2')||(back.charAt(0)=='4')) {
				sex = "여자";
			}else {
				sex ="남자";
			}
		}
		
		return sex;
	}
	
	public static int calAge(String birth, String back) {
		int age=0;
		if(back.charAt(0)>='1'&& back.charAt(0)<='2') {
			age = 2024-Integer.parseInt("19"+birth.substring(0,2)) ;
		}else {
			age = 2024-Integer.parseInt("20"+birth.substring(0,2)) ;
		}
		return age;
	}

	public static boolean isNumeric(String temp) {
		for(int i =0;i<temp.length();i++) {
			if((temp.charAt(i)<'0')||(temp.charAt(i)>'9')) return false;
		}
		return true;
	}
}
