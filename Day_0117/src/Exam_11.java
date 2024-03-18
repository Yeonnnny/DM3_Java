import java.util.Scanner;

public class Exam_11 {
    public static void main(String[] args) {

        // 1) x에 큰값이 들어가도록 출력하시오

        int x, y, temp;

        Scanner scanner = new Scanner(System.in);

        // System.out.print("두 개의 정수값을 입력하세요 : ");
        // x = scanner.nextInt(); // 입력시 구분자 : tab, enter, space ==> white space
        // y = scanner.nextInt();

        // if (x < y) {
        //     temp = x;
        //     x = y;
        //     y = temp;
        // }

        // System.out.println("x = " + x + ", y = " + y);

        // 2) 키보드로부터 서로다른 3개의 정수값을 입력
        int max, median, min;

        // 입력
        
        System.out.print("정수 3개를 입력하세요 : ");
        max = scanner.nextInt();
        median = scanner.nextInt();
        min = scanner.nextInt();

        // 처리 (데이타의 순서에 맞게 변경)

        if(max<median){
            temp = max;
            max = median;
            median = temp;
        }

        if (max<min){
            temp = max;
            max = min;
            min = temp;
        }

        if (median<min){
            temp = median;
            median =min;
            min =temp;
        }


        // 출력
        System.out.println("max = " + max + ", median = " + median + ", min = " + min);


        if (median > 10) System.out.println("10보다 크다");

        scanner.close();

    }
}
