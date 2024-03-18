public class Exam_21 {
    public static void main(String[] args) {

        for (char a = 'A'; a <= 'Z'; a++) {

            for (char c = 'Z'; c > a; c--) {
                System.out.print(" ");
            }

            for (char c = 'A'; c <= a; c++) {
                System.out.print(c);
            }

            System.out.println();
        } // end for

    }// end main
}
