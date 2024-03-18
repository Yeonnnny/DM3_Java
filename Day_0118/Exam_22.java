/*
 * 2*1=2   3*1=3  4*1=4
 */
public class Exam_22 {
    public static void main(String[] args) {
        for(int i=1; i<=9;i++){
            for(int dan1=2; dan1<=5;dan1++){
                System.out.printf("%d X %d = %d\t",dan1,i,dan1*i);
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1; i<=9;i++){
            for(int dan2=6; dan2<=9;dan2++){
                System.out.printf("%d X %d = %d\t",dan2,i,dan2*i);
            }      
            System.out.println();
        }



        for(int j=2;j<10;j+=4){
            for(int i=1; i<=9;i++){          
                for(int dan=j; dan<(j+4);dan++){
                    System.out.printf("%d X %d = %d\t",dan,i,dan*i);
                }      
                System.out.println();           
            }
            System.out.println();       
        }
         
    }
}
