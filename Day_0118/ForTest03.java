public class ForTest03 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            // & : 논리 연산에 쓰일 때 short circuit 하지 않음
            if (!(i % 3 == 0 && i % 5 == 0)) continue;

            System.out.println(i);

        } // end for

    } // end main
}
