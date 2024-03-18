import java.util.Scanner;

public class Exam_24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        // 입력 받기
        System.out.print("입력 : ");
        num = scanner.nextInt();

        if (num < 4) { // 입력 받은 수가 4보다 작은 경우 1,2,3 모두 소수임
            for (int i = 1; i <= num; i++) {
                System.out.printf("%d ", i);
            }
        } else {
            System.out.print("1 2 3 ");

            for (int i = 4; i <= num; i++) {

                boolean isPrim = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrim = false;
                        break;
                    }
                }

                if (isPrim == true)
                    System.out.printf("%d ", i);
            }

        } // end for

    }// end main
}
