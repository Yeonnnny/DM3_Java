public class WhileTest01 {
    public static void main(String[] args) {
        // int i = 0;
        // while(i++<10){  // 1. 비교 : 참 > 2. 증가 > 3. 진입
        //     System.out.println(i);
        // }
        // System.out.println("End");

        // 1~10 까지 홀수만 출력 (while)
        int i = 0;
        while (i<10){
            ++i;
            if (i%2==1) System.out.println(i);
        }

        i=1;
        while(i<10){
            System.out.println(i);
            i+=2;
        }

        i=1;
        while(true){
            System.out.println(i);
            i+=2;
            if (i>10) break; // 자신을 감싼 한 개의 반복문만 빠져나감
        }

        ; //null statement
    }
}
