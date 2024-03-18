package mypackage2;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount b1 = new BankAccount();

        System.out.println("---Bank 시스템---");
        System.out.print("> 이름 : "); 
        b1.setName(scanner.nextLine());
        b1.setNo((int)(Math.random()*1000000000+1)+""); // 10자리의 계좌번호 생성
        b1.setBalance(100_000); // 초기 잔고 100,000원

        while(true){

            System.out.println("\n-------------------");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔고 조회");
            System.out.println("0. 종료");
            System.out.println("-------------------");
            System.out.print("> 선택 : ");
            String menu = scanner.next();
    
            if (menu.equals("0")){
                System.out.println("\nBanking 시스템 종료하겠습니다. 이용해주셔서 감사합니다.");
                break;
            }
    
            switch (menu) {
                case "1":
                    System.out.println("##### 입금 #####");
                    System.out.print("> 입금할 금액 : ");
                    b1.deposit(scanner.nextInt());
                    break;
                case "2":
                    System.out.println("##### 출금 #####");
                    System.out.print("> 출금할 금액 : ");
                    b1.withraw(scanner.nextInt());           
                    break;       
                case "3":
                    System.out.println("### 잔고 조회 ###");
                    b1.output();
                    break;       
                default:
                    System.out.println("### 메뉴를 다시 선택해주세요 ###");
                    continue;
            }
        }




        
    }
}
