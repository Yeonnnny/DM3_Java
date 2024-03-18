import java.util.Scanner;

public class Exam_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean isPrim=true;
        

        System.out.print("입력 : ");
        num = scanner.nextInt();
      
        if (num<=3){
            System.out.printf("%d은(는) 소수입니다.",num);
        }else {            
            for(int i=2; i<num; i++){
                if(num%i==0) {
                    isPrim=false; //소수가 아님
                    break;
                }
            }

            String str = (isPrim)? "소수입니다." : "소수가 아닙니다.";
            System.out.printf("%d은(는) %s", num, str);
            
        }

        scanner.close();

    }
}
