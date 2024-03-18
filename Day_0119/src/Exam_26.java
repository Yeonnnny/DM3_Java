public class Exam_26 {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int temp, count = 0;
        boolean isEqual = false; // 동일한 값이 있는지 확인하기 위한 flag변수

        while (count < arr1.length) {
            // [1~100]난수 생성
            temp = (int) (Math.random() * 100 + 1);

            // 0부터 count번쨰까지 배열 확인
            for (int i = 0; i <= count; i++) {
                if (arr1[i] == temp) {
                    isEqual = true;
                    break;
                }
            }

            if (isEqual == false) {
                arr1[count] = temp;
                count += 1;
            }

        } // end while

        // 결과 출력
        System.out.println("결과");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }// end main
}
