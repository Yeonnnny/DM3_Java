public class Exam_26_explain {
    public static void main(String[] args) {
        int[] iary = new int[5];
        int temp;

        for (int i = 0; i < iary.length; ++i) {
            temp = (int) (Math.random() * 99 + 1);
            iary[i] = temp;

            for (int j = 0; j < i; j++) {
                if (iary[j] == temp) {
                    --i;
                    break;
                }
            } // end 2nd for

        } // end 1st for

    } // end main
}
