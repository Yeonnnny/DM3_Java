public class ArrayTest03 {
    public static void main(String[] args) {
        String[] sary1 = new String[]{"봄","여름","가을","겨울"}; 
        String[] sary2 = {"봄","여름","가을","겨울"}; 
        String[] sary3 = {new String("봄"), new String("여름"),new String("가을"),new String("겨울")}; 
        
        System.out.println(sary1[0]==sary2[0]); //true


    }
}
