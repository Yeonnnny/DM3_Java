public class MethodTest02 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println(x + " " + y); 
        exchange(x, y); // call by value (값에 의한 호출)
        System.out.println(x + " " + y);
    }

    public static void exchange(int x, int y) {
        int temp;
        temp = x;
        x = y;
        y = temp;
    }
}
