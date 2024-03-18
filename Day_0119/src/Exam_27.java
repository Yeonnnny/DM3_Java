public class Exam_27 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        // 내가 짠 코드
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    arr[i][j] = sum;
                    break;
                }
                arr[i][j] = (int)(Math.random() * 99 + 1);
                sum += arr[i][j];
            }
        }

        // 교수님 코드
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {              
                arr[i][j] = (int)(Math.random() * 99 +1);
                arr[i][4] += arr[i][j];
            }
        }
        
        // 출력
        for (int[] i : arr) {
            for (int j : i) {
                System.out.printf("%3d ", j);
            }
            System.out.println();
        }

    } // end main
}
