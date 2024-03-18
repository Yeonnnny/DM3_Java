
public class OperatorTest1 {

	public static void main(String[] args) {

		int a = 13;
		
		String data ;
		
		data = (a%2==0)? "짝수":"홀수" ;

		System.out.printf("%d은 %s입니다.\n",a,data);
		
		a = -90;
		
		data = (a>0)? "양수": (a<0)?"음수":"영";
		System.out.printf("%d은 %s입니다.",a,data);
		
				
		
	}

}
