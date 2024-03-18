package mypackage2;

public class ScoreTest {
    public static void main(String[] args) {
        
        Score s1 = new Score();
        s1.setId("123");
        s1.setName("김도연");
        s1.setKor(98);
        s1.setEng(100);
        s1.setMath(100);
        s1.calcAvg();
        s1.output();
        
        Score s2 =  new Score();
        s2.setId("234");
        s2.setName("김미래");
        s2.setKor(100);
        s2.setEng(100);
        s2.setMath(100);
        s2.calcAvg();
        s2.output();
        

    } // end main

}
