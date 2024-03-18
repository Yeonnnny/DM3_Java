import java.util.Scanner;

public class Exam_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0; // 연산 결과 저장을 위한 변수

        while (true) {

            // 메뉴
            printMenu();
            String menu = scanner.nextLine();

            if (menu.equals("0")) {
                System.out.println("### 프로그램 종료 ###");
                scanner.close();
                return;
                //break;
            }

            result = switch (menu) {
                case "1" -> add();
                case "2" -> substract();
                case "3" -> multiple();
                default -> divide();
            };

            System.out.println("결과 : " + result);
        
        } // end while
    } // end main

    public static void printMenu() {
        System.out.println("\n---< MENU >---");
        System.out.println("1. 덧셈");
        System.out.println("2. 뺄셈");
        System.out.println("3. 곱셈");
        System.out.println("4. 나눗셈");
        System.out.println("0. 종료");
        System.out.println("---------------");
        System.out.print("> 선택 : ");
    }

    public static double[] getInputValues() {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[2];
        System.out.println();
        System.out.print("값1 : ");
        values[0] = scanner.nextDouble();
        System.out.print("값2 : ");
        values[1] = scanner.nextDouble();
        return values;
    }

    public static double add() {
        System.out.println("\n### 덧셈 ###");
        double[] values = getInputValues();
        return values[0] + values[1];
    }

    public static double substract() {
        System.out.println("\n### 뺄셈 ###");
        double[] values = getInputValues();
        return values[0] - values[1];
    }

    public static double multiple() {
        System.out.println("\n### 곱셈 ###");
        double[] values = getInputValues();
        return values[0] * values[1];
    }

    public static double divide() {
        System.out.println("\n### 나눗셈 ###");
        double[] values = getInputValues();
        return values[0] / values[1];
    }
}
