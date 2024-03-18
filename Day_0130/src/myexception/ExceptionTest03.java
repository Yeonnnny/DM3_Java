package myexception;

public class ExceptionTest03 {

	public static void main(String[] args) {
		try {
			
			String[] ary = {"1","0","abc"};
			
			int x = Integer.parseInt(ary[0]);
			int y = Integer.parseInt(ary[3]);
			double result = x/y;
			
			System.out.println("연산결과 : "+result);
			
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
//			return;           // finally 구문으로 감
//			System.exit(0);   // finally 구문으로 가지 않음
		}catch(Exception e) { //최종보스 : 위의 예외처리문에 걸리지 않으면 이 구문에서 무조건 처리됨. 그러므로 가장 하위 catch블럭에 넣어야 함
			e.printStackTrace();
		}finally{
			System.out.println("반드시 들러야 하는 블럭");
		}
		
		System.out.println("마지막 처리하는 코드");

	}

}
