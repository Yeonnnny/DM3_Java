public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = new int[10];

        // 1~99 범위의 난수로 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 99 + 1);
        }

        System.out.println("\n## 정렬 전");
        for (int i : arr)
            System.out.print(i + " ");

        int temp;
        // 선택 정렬 (오름차순)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            } // end 2nd for
        } // end 1st for

        System.out.println("\n## 정렬 후");
        for (int i : arr)
            System.out.print(i + " ");

    } // end main
}
