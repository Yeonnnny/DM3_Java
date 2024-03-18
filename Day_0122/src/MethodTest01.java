
// static에서는 non-static 호출 불가!!!!!!!!!!!!!!!!
// non-static은 class생성시 메모리에 올라가지만, static은 프로그램 실행 시 맨 처음 메모리에 올라감
// 가급적 static은 사용을 많이 하지 마시오 => 메모리 부족 가능성 높음
// static지정자가 붙은 것은 static을 관리하는 static 메모리에 따로 올라감

public class MethodTest01 {
    
    // 메소드의 선언과 정의
    public static int add(int a, int b){ // a,b : argument
        int result = a+b;
        return result;
    } 
    
    public static void main(String[] args) {
        int a = 12;
        int b = 34;
        int result = add(a,b);
        System.out.printf("%d + %d = %d", a,b, result);

        double data = Math.random();
        // public class Math {
        //     public static double random(){
        //         return 더블형
        //     }
        // }

    } // end main
    
}
