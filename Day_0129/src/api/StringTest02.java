package api;

public class StringTest02 {

	public static void main(String[] args) {

		String str = "무궁화 꽃이 피었습니다.";
		char ch = str.charAt(4);
		System.out.println(ch);
		
		int code = str.codePointAt(3); // 특정 알파벳을 가져올 때 사용.... 대문자인지 소문자인지 파악하고자 할 때 사용하기도 함
		System.out.println(code);
		
		// equals() : 같다 or 다르다의 여부만 확인
		// compareTo() : 앞크(양), 뒤크(음), 같(0)
		int diff = "Korea".compareTo("korea"); // 65-97 // 0이 반환되면 같은 데이터임
		System.out.println(diff); // -32
		
		
		String temp = "월드".concat("컵");
		System.out.println(temp);
		
		boolean result = str.contains("장미");
		System.out.println(result);
		
		result = str.endsWith("다.");
		System.out.println(result);
		
		result = str.startsWith("무궁");
		System.out.println(result);
		
		int index = str.indexOf('꽃');
		System.out.println(index);
		
		index = str.indexOf('강');
		System.out.println(index);
		
		result = "".isEmpty();
		System.out.println(result);
		
		result = "        19911225         ".trim().isEmpty();
		System.out.println(result);
		System.out.println("        19911225         ".trim());
		System.out.println("        19911225         ".length());
		
		String carNum = "1a1하5304";
		String front = carNum.substring(0,3);
		String back = carNum.substring(4);
		System.out.println(carNum+" : "+isNumeric(carNum));
		System.out.println(front+" : "+isNumeric(front));
		System.out.println(back+" : "+isNumeric(back));
		
		if(isNumeric(front) && isNumeric(back)) {
			System.out.println("올바른 자동차 번호입니다.");
		}else
			System.out.println("올바른 자동차 번호가 아닙니다.");
		
		
		String name = "저팔계";
		double m = 42.195;
		double time = 12.45;
		
		String d = String.format("%s선수는 마라톤 %f 구간을 %8.3f시간이 걸렸다.", name, m,time); 
		System.out.println(d);   
		
		String student = "전우치 100 98 88";
		String[] jumsu = student.split(" ");
		String n = jumsu[0];
		int kor = Integer.parseInt(jumsu[1]);
		int eng = Integer.parseInt(jumsu[2]);
		int mat = Integer.parseInt(jumsu[3]); // 전달인자를 문자열로 줘서 int형으로 변환해줌. 숫자가 아닌 것은 exception됨
		
		int total = kor+eng+mat;
		double avg = total/3.0;
		System.out.println("합계 : "+total+", 평균 : "+avg);
		
		
		System.out.println((int)('0'));   // 48
		System.out.println('0'+1);   // == '1' // 49
		
		
	
	}
	
	public static boolean isNumeric(String temp) {
		for(int i =0;i<temp.length();i++) {
			if((temp.charAt(i)<'0')||(temp.charAt(i)>'9')) return false;
		}
		return true;
	}
}
