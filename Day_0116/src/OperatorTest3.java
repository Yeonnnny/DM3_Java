
public class OperatorTest3 {

	public static void main(String[] args) {

//		boolean b1 = true;
//		boolean b2 = false;
//		boolean result;
//		
//		result = b1 && b2; // && : 둘다 true일 때 true
//		result = b1 || b2; // || : 둘 중 하나면 true이면 true
//		result = !b1 ; // ! : 부정의미. true이면 false로, false이면 true로
//		
		// 출결점수 80점 이상, 세과목의 평균이 60점 이상, 과락이 없을 경우(전과목 모두 40점 이상)에만
		//수료한다고 가정했을 때
		boolean isGraduate;
		int attendence, trade, it;
		
		attendence = 80;
		trade = 41;
		it = 41;
		
		isGraduate = (attendence >=80) && ((attendence+trade+it)/3.0 >= 60) && (attendence>=40 && trade>=40 && it>=40);
		
		String result = (isGraduate)? "수료" : "미수료";
		
		System.out.printf("당신은 %s입니다.",result);
			
		
		
		
	}

}
