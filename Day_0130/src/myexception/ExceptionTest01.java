package myexception;

public class ExceptionTest01 {

	public static void main(String[] args) {
		try {
			
			String[] ary = {"1","0","abc"};
			
			int x = Integer.parseInt(ary[0]);
			int y = Integer.parseInt(ary[3]);
			double result = x/y;
			
			System.out.println("연산결과 : "+result);
			
		}catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException  e) { //multi-catch exception (Exception은 모두 다 잡을 수 있기 때문에 같이 사용 불가)
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally{
			System.out.println("반드시 들러야 하는 블럭");
		}
		
		System.out.println("마지막 처리하는 코드");

	}

}
