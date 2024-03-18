import java.util.Scanner;

public class Exam_14 {
    public static void main(String[] args) {
        /*
         * while문 if문
         * 놀이동산에서 열차 운영
         * 수용인원 : 5명
         * 탑승 가능 키 : 150이상, 180이하
         */

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double height = 0;

        System.out.println("\n**** 환상의 나라 에버랜드 ****\n");
        System.out.println("\t★ 티익스프레스 ★\n");

        while (true) {

            if (count == 5) {
                System.out.println(">>>>>>>>>>>> 열");
                System.out.println(">>>>>>>>>>>>>> 차 ");
                System.out.println(">>>>>>>>>>>>>>>> 출");
                System.out.println(">>>>>>>>>>>>>>>>>> 발");
                break;
            }

            System.out.print("키는 몇 cm입니까? : ");
            height = scanner.nextDouble();

            // if (!(height <150 || height>180)) count+=1;
            if (height >= 150 && height <= 180) count += 1;

            System.out.printf("### %d명 탑승 ###\n\n", count);

        } // end while

        scanner.close();

    }// end main
}
