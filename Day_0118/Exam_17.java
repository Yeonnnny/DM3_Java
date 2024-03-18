public class Exam_17 {
    public static void main(String[] args) {
        
        for(int i =0; i<=127; i+=1){
            if (i!=0 && i%5==0)  System.out.println();
            System.out.printf("%3d : %c  ",i,(char)i);

        }

    }
}
