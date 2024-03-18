public class OverloadingTest01 {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1.0,2.0);
        add(1.0,2.0,3.0);
        add(1.5f, 1.6f);
        int result = add('a','b');
        System.out.println(result);
        
    }
    // 1)
    public static int add(int x, int y){
        return x+y;
    }
    // 2)
    public static double add(double x, double y, double z){
        return x+y+z;
    }
    // 3)
    public static double add(double x, double y){
        return x+y;
    }
}
