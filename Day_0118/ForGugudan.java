import java.util.Scanner;

public class ForGugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dan;

        System.out.print("출력할 단 : ");
        dan = scanner.nextInt();

        for (int i = 1; i <= 9; i++)
            System.out.printf("%d x %d = %d%n", dan, i, dan * i);
        scanner.close();

    }// end main
}
