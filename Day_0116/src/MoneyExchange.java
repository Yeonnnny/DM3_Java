/*
 * [문제-7] 금액 환산

철수는 가게에서 물건을 구매하였다. 물건의 가격과 철수가 지불한 금액을 입력 받아 지불에 필요한 5만원권, 만원 권, 5천원권, 천원권의
최소 개수와 나머지 금액 구하여 출력하시오.
 */

import java.util.Scanner;

public class MoneyExchange {

	public static void main(String[] args) {
		
		int price ;
		int money, num1,num2,num3,num4;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("상품 가격을 입력하세요 : ");
		price = scan.nextInt();
		
		money = price;
		
		
		num1 = money/50000;
		money -= num1*50000;
		
		num2 = money/10000;
		money -= num2*10000;
		
		num3 = money/5000;
		money -= num3*5000;
		
		num4 = money/1000;
		money -= num4*1000;
		
		
		System.out.printf("%d원은 5만원권 %d장, 1만원권 %d장, 5천원권 %d장, 1천원권 %d장을 지불하고 %d원이 남습니다.",price, num1,num2,num3,num4,money);
		
		
		scan.close();
		
	}

}
