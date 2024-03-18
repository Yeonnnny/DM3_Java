import java.util.Scanner;

public class Exam_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, address;
        int kor = 0, eng = 0;
        double avg = 0.0;

        for (int i = 0; i < 3; i++) {
            System.out.print("이름 : ");
            name = scanner.nextLine();

            System.out.print("주소 : ");
            address = scanner.nextLine();

            System.out.print("국어 : ");
            kor = scanner.nextInt();

            System.out.print("영어 : ");
            eng = scanner.nextInt();

            avg = (kor + eng) / 2.0;
            System.out.printf("%s (%s) : %d %d %.2f %n%n",name,address, kor, eng, avg);
            scanner.nextLine();

        }
    }
}
