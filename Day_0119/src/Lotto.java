import java.util.Scanner;

public class Lotto {

    // 로또 번호 생성 함수
    public static void createLottoNum(int[] input) {
        int[] target = input;
        for (int i = 0; i < 7; i++) {
            target[i] = (int) (Math.random() * 46 + 1);
            for (int j = 0; j < i; j++) {
                if (target[j] == target[i]) {
                    --i;
                    break;
                }
            }
        }
    }

    // 로또 번호 출력 함수
    public static void printLotto(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (i == input.length - 1) {
                System.out.print("+ "); // 보너스 번호 표시
            }
            System.out.print(input[i] + " ");
        }
    }

    // Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] target = new int[7]; // 로또 정답을 저장할 변수
        int num, menu; // 횟수, 방식에 대한 메뉴 선택

        System.out.println("\n$$$ 로또 프로그램 $$$\n");

        // 로또 번호 생성
        createLottoNum(target);

        // 로또 번호 출력
        printLotto(target);

        // 로또 횟수 물어보기
        System.out.print("\n몇 번 하시겠습니까? ");
        num = scanner.nextInt();
        int[][] input = new int[num][7];

        // num번 반복
        for (int i = 0; i < num; i++) {

            System.out.println("\n<" + (i + 1) + "번째 시도>");

            // 자동/ 수동 여부 확인
            System.out.println("-------------");
            System.out.println("1. 자동\n2. 수동");
            System.out.println("-------------");
            System.out.print("선택 > ");
            menu = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            // 로또 번호 생성
            switch (menu) {
                case 1: // 자동 : 7개 난수 생성 후 배열에 저장
                    System.out.println("##### 자동 번호 생성 #####");
                    System.out.print(">> ");
                    // 자동 생성
                    for (int j = 0; j < 7; j++) {
                        input[i][j] = (int) (Math.random() * 46 + 1);
                        for (int k = 0; k < j; k++) {
                            if (input[i][k] == input[i][j]) {
                                --j;
                                break;
                            }
                        }
                    }
                    break;

                default: // 수동 : 7개 값 입력 받아 배열에 저장
                    System.out.println("### 수동 번호 생성 ###");
                    System.out.println("1~46 범위 내의 정수 7개 입력하세요.");
                    System.out.print(">> ");
                    // 7개 정수 입력받기 (오류없다고 가정)
                    for (int a = 0; a < input[i].length; a++)
                        input[i][a] = scanner.nextInt();
                    break;

            } // end switch

            // 사용자 로또 번호 출력
            for (int j = 0; j < input[i].length; j++) {
                if (j == input[i].length - 1) {
                    System.out.print("+ "); // 보너스 번호 표시
                }
                System.out.print(input[i][j] + " ");
            }

            // 로또 당첨 조건 확인
            int count = 0; // max = 6
            int bonus = 0; // max = 1

            // 앞 6자리 확인
            for (int j = 0; j < target.length - 1; j++) {
                for (int k = 0; k < input[i].length - 1; k++) {
                    if (target[j] == input[i][k])
                        count += 1;
                }
            }
            // 마지막 번호 확인
            if (target[6] == input[i][6])
                bonus = 1;

            String result;
            if (count < 3) {
                result = "낙첨";
            } else if (count == 3) {
                result = "5등";
            } else if (count == 4) {
                result = "4등";
            } else if (count == 5 && bonus != 1) {
                result = "3등";
            } else if (count == 5 && bonus == 1) {
                result = "2등";
            } else {
                result = "1등";
            }

            System.out.println("\n####### " + result + "입니다 #######");
            System.out.println();

        }

    } // end main
}