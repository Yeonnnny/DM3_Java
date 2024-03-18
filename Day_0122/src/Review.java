
public class Review {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2;

        // 얕은 복사
        arr2 = arr1;
        arr2[1]=200;
        for(int temp : arr1)
            System.out.print(temp+" ");

    } // end main
}
