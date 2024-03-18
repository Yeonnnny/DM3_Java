public class OperatorTest4 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        System.out.println("초기값 : x = " + x + ", y = " + y);

        y = ++x;
        System.out.println("선증가 후 : x = " + x + ", y = " + y);

        y = x++;
        System.out.println("후증가 후 : x = " + x + ", y = " + y);

        x = 0;
        y = 0;
        y = ++x + x++;
        /*
         * 1. ++x          // x=1
         * 2. ++x + x      // 2
         * 3. y = ++x + x  // y=2
         * 4. x++          // x=2
         */
        System.out.println("x=" + x + ", y=" + y);

        double z = 0;
        ++z;
        System.out.println(z);

    }
}
