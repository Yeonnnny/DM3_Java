
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr1; // arr은 정수형 1차원 배열
        arr1 = new int[10]; // heap에 정수형인 크기가 10인 배열을 만들고 그 주소를 arr1에 넣음

        System.out.println(arr1); // 진짜 주소가 아님

        System.out.println(arr1[0]);
        System.out.println(arr1.length);
        // System.out.println(arr1[-1]); // error : outOfIndex

        int[] arr2 = new int[] {1,2,3,4,5}; // 개수 지정하지 않고 값을 넣고 값의 개수만큼 메모리가 할당됨
        
        int[] arr3 = {11,22,33,44,55}; // 선언과 동시에 초기화, 데이터 요소의 개수에 따라 배열의 메모리 크기가 정해짐
        
        int[] arr4 = new int[10];

        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }


    }

}
