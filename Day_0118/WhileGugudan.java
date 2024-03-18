import java.util.Scanner;

public class WhileGugudan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dan;
        int i = 1;

        System.out.print("출력할 단 입력 : ");
        dan = scanner.nextInt();

        while (i <= 9) {
            System.out.printf("%d x %d = %d%n", dan, i, dan * i);
            i++;
        } // end while

        scanner.close();

    }// end main
}