public class ArrayTest08 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];
        
        // index 0~4개 요소 복사
        System.arraycopy(arr1, 2, arr2, 0, 3);
        for(int i : arr1)
            System.out.print(i+" ");
        
        System.out.println();
    
        for(int i : arr2)
            System.out.print(i+" ");
        
    }
}
