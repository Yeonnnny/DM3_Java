public class ForTest01 {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i += 2) {

            for (int j = 0; j < i; j++) {
                System.out.print('★');
            }
            
            System.out.println();
        }

    }// end main
}
