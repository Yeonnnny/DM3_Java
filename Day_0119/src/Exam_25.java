public class Exam_25 {
    public static void main(String[] args) {
        
        int[] arr1 = new int[10];
        int temp;

        // [1~100]난수로 초기화
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = (int) (Math.random() * 99 + 1);

        // 처리 정 결과 출력
        System.out.print("처리 전 : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        // 반전 처리 (교환)
        for (int i = 0; i < arr1.length / 2; i++) {
            temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = temp;
        }

        // 처리 후 결과 출력
        System.out.print("처리 후 : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
