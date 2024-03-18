public class ForTest02 {
    public static void main(String[] args) {

        for (int i =0; i<10;i++){
            
            System.out.printf("%2d : ",i+1);

            for (char alpha = 'a'; alpha <= 'z'; alpha += 1)
                System.out.print(alpha + " ");
        
            System.out.println();
        }
            
    }// end main
}
