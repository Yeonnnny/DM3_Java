import java.util.Scanner;

public class Exam_13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int a,b;
        double result=0;
        int menu=0;

        while(true){

            System.out.println();
            System.out.println("------------------");
            System.out.println("  1. 덧셈");
            System.out.println("  2. 뺄셈");
            System.out.println("  3. 곱셈");
            System.out.println("  4. 나눗셈");
            System.out.println("  0. 종료");
            System.out.println("------------------");
            System.out.print("> 선택 : ");
            menu = scanner.nextInt();

            // 0을 입력한 경우 반복문 빠져나감
            if (menu==0) {
                System.out.println("## 프로그램을 종료합니다.");
                break;
            } 
            
            // 메뉴의 범위를 벗어난 숫자를 입력한 경우
            if (menu<1 || menu>4){
                System.out.println("## 메뉴를 다시 선택해 주세요.");
                continue;
            }

            System.out.print("\n두 개의 정수 입력 : ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            
             result = switch(menu) {
                case 1-> a+b;
                case 2-> a-b;
                case 3-> a*b;
                default -> a/(double)(b); 
            };

            System.out.println("결과 : "+result);

        } // end while
        
        scanner.close();

    }//end main
}
