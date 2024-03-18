// Deep copy

import java.util.Arrays;

public class ArrayTest07 {
    public static void main(String[] args) {
        int[] source ={1,2,3,4,5};
        int[] target ;

        // 원본의 크기보다 크게 to값을 주면 0으로 채워짐
        target = Arrays.copyOfRange(source, 1,10);

        for(int i:target)                                                                            
            System.out.print(i+" ");
        
    }
}
