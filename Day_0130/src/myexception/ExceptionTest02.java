package myexception;

public class ExceptionTest02 {

	public static void main(String[] args) {

		int a = 12, b = -1;
		int c =0;
		
		
		try {
			c = add(a,b);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		
		
		System.out.println("결과는 "+c);

	}
	
	// y는 절대 음수일 수 없는 상황이라고 가정
	public static int add(int x, int y) throws Exception {
	
		if(y<0) 
			throw new Exception("y값은 음수가 될 수 없습니다."); // 처리하지 않고 호출한곳으로 예외 던짐
			
		int result = x + y;
		
		
		return result;
	}
}
