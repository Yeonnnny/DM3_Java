public class MethodTest03 {
    public static void main(String[] args) {
        int[] arr = {10,20};

        System.out.println(arr[0] + " " + arr[1]); 
        exchange(arr); // call by reference (참조에 의한 호출)
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void exchange(int[] arr) {
        int temp;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1]= temp;
    }
    
}
