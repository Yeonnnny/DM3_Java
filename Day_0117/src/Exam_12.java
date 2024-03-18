/*[문제] 두개의 정수 값을 입력 받음. 연산 종류를 입력받아 결과 출력 
 * <실행 예>
 * 두 개의 정수 입력 : 10 20
 * 
 * 1. 덧셈 (+)
 * 2. 뺄셈 (-)
 * 3. 곱셈 (*)
 * 4. 나눗셈 (/)
 * -------------
 * 선택 : 2
 * 결과 : -10
*/

import java.util.Scanner;

public class Exam_12 {
    public static void main(String[] args) {
        int a, b;
        double result = 0.0;
        Scanner scanner = new Scanner(System.in);
        
        // 정수 입력
        System.out.print("두 개의 정수 입력 : ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("\n1. 덧셈 (+)\n" + 
                "2. 뺄셈 (-)\n" + 
                "3. 곱셈 (*)\n" + 
                "4. 나눗셈 (/)\n" + 
                "-------------" );
        System.out.print("선택 : ");
        // 1)
        // String menu = scanner.next();

        // switch (menu) {
        //     case "1"-> result = a+b;
        //     case "2"-> result = a-b;
        //     case "3"-> result = a*b;
        //     case "4"-> result = a/(double)(b);
        //     default ->{ 
        //         System.out.println("키 입력이 잘못되었습니다.");
        //         System.exit(0); // 프로그램 강제 종료
        //     }
        // }

        // 2)
        int menu = scanner.nextInt();

        result = switch(menu) {
            case 1-> a+b;
            case 2-> a-b;
            case 3-> a*b;
            case 4-> a/(double)(b);
            default -> 0 ;  // 없으면 오류 case 2의 결과값과 같을 경우 오류인지 결과물인지 알 수 없음
        };

        // Switch 식
        String result1 = switch(menu) {
            case 1-> a+b+"";
            case 2-> a-b+"";
            case 3-> a*b+"";
            case 4-> a/(double)(b)+"";
            default -> "키 잘못 입력함" ;  
        };

        // yield 사용
        String result2 = switch(menu) {
            case 1 : yield (a+b+"");
            case 2 : yield (a-b+"");
            case 3 : yield (a*b+"");
            case 4 : yield (a/(double)(b)+"");
            default : yield "키 잘못 입력함" ;  
        };

        System.out.println("결과 : "+ result2);

        scanner.close();
    }
    
}
