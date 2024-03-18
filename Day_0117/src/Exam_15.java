import java.util.Scanner;

public class Exam_15 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int result =0;
        int n, i=0;

        System.out.println(" \n1) n 자연수의 합\n");
        System.out.print("n을 입력하세요 : ");
        n = scanner.nextInt();
        
        while (i<=n) {
        	result += i;
        	++i;
        } // end while
        
        System.out.printf("1~%d까지의 합 : %d",n,result);

        scanner.close();
    }
}
