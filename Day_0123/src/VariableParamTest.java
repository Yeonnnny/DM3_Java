public class VariableParamTest {
    public static void main(String[] args) {
    
        add(10,20);
    
    }

    public static int add(int x,int y){ // 타입... : 파라미터 단계에서만 사용가능 함 : 배열은 아닌데 배열처럼 사용가능함. 동적배열임. 배열로 받을 수는 없음
        System.out.println("첫 번째 메소드");
        return 0;
    }
 
    // 가변인자 메소드보다 타입이 정확한 메소드가 우선순위가 높음
    public static int add(int... x){ // 타입... : 파라미터 단계에서만 사용가능 함 : 배열은 아닌데 배열처럼 사용가능함. 동적배열임. 배열로 받을 수는 없음
        System.out.println("두 번째 메소드");
        System.out.println(x.length);
        return 0;
    }
}
