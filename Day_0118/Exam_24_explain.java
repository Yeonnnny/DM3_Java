import java.util.Scanner;

public class Exam_24_explain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int count = 0; // 소수의 개수를 세는 변수
        boolean isPrime = true;

        System.out.print("정수 입력 : ");
        value = scanner.nextInt();

        for (int i = 2; i < value; i++) {
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count += 1;
                System.out.printf("%d ", i);
            }

            isPrime = true;
        } // end for

        System.out.printf("%n2~%d 까지 소수의 개수 : %d", value, count);

    }
}
