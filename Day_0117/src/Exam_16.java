import java.util.Scanner;

public class Exam_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int i=1;
        int result = 1;
        
        System.out.println("\n2) n!을 구하기");
        System.out.print("자연수 n 입력 : ");
        n = scanner.nextInt();
        
        if (n<1 || n>10) {
        	System.out.println("1~10까지만 입력 가능");
        	System.exit(0); // return; // 현재 메서드를 호출한 곳으로 되돌아가도록 제어하는 의미 => main을 호출한 JVM으로 되돌아가라는 것은 프로그램 종료의 의미
        }
        
//        System.out.printf("%d! = ",n);
//        
//        while(n>0){
//            result*=n;
//            --n;
//        }
//        
//        System.out.printf("%d",result);
        
        while(i<=n) {
        	result *= i;
        	i++;
        }
        System.out.printf("%d! = %d", n, result);
        
        scanner.close();
    }
}
