public class ArrayTest02 {
    public static void main(String[] args) {

        double[] darr = new double[10];
        
        // 1)
        // 난수를 이용해 초기화하기
        for(int i=0; i<darr.length;i++)
        darr[i] = Math.random();  // [0,1)사이의 double형 난수 반환
        
        //출력하기
        for(int i =0;i<darr.length;i++)
        System.out.println(darr[i]);
        
        System.out.println();
        
        
        // 2)        
        // 난수를 이용해 초기화하기
        for(int i=0; i<darr.length;i++)
        darr[i] = Math.random()*100;  // [0,100) 사이의 double형 난수 반환
        
        //출력하기
        for(int i =0;i<darr.length;i++)
        System.out.println(darr[i]);
        
        System.out.println();
        
        
        // 3)        
        int[] arr = new int[10];
        
        for(int i=0; i<arr.length;i++)
            //arr[i] = (int)(Math.random()*100 + 1);  // [1,100] 사이의 int형 난수 반환
            // 정수 난수 반환 시 : (int)(Math.random() * (개수) +- 시작점)
            arr[i] = (int)(Math.random()*100-50); // [-50,49]  =>  *100 : 범위 개수(크기), -50 : 시작점

        //출력하기
        for(int i =0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        

        

    }
}
