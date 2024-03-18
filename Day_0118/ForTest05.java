public class ForTest05 {
    public static void main(String[] args) {
        // 재세팅되는 애가 안쪽 for문
        for(int dan=2;dan<=9;dan++){
            System.out.println("["+dan+"단]");
            for(int i = 1;i<=9;i++){
                System.out.printf("%d X %d = %2d%n", dan,i,dan*i);
            }
            System.out.println();
        }
    }
}
