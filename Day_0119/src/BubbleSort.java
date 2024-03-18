public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[10];

        // 1~99 범위의 난수로 초기화
        for(int i =0; i<arr.length;i++){
            arr[i] = (int)(Math.random()*99+1);
        }
        System.out.println("\n## 정렬 전");
        for(int i : arr)
            System.out.print(i+" ");
            
        // 버블 정렬
        for (int i = 0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
        }
        
        System.out.println("\n## 정렬 후");
        for(int i : arr)
            System.out.print(i+" ");

    }
}
