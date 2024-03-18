import java.util.Scanner;

public class Exam_23_explain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        boolean isPrime = true;

        System.out.print("정수 입력 : ");
        value = scanner.nextInt();

        for(int i=2; i<value;i++){
            if(value%i == 0) {
                isPrime = false;
                break;
            }
        }

        //
        if(isPrime) System.out.println(value+"는 소수입니다.");
        else        System.out.println(value+"는 소수가 아닙니다.");
        
    }
}
