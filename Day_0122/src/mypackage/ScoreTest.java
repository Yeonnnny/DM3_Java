package mypackage;

public class ScoreTest {
    public static void main(String[] args) {
        // Score 클래스를 생성하기
        // Score 변수명 = new Score();
        Score s1 = new Score(); // non-static은 new를 해서 생성해야 함
        s1.id ="20200684";
        s1.name = "김도연";
        s1.kor = 98;
        s1.math = 97;
        s1.eng = 100;
        s1.calcAvg();
        s1.output();
        //output(s1);
        
        // s2객체를 임의로 생성하여 결과를 출력
        Score s2 =  new Score();
        s2.id = "20200685";
        s2.name = "김솔";
        s2.kor = 87;
        s2.math = 97;
        s2.eng = 100;
        s2.calcAvg();
        s2.output();
        //output(s2);
        

    } // end main


    // public static void output(Score s){
    //     System.out.printf("%s의 평균 : %.3f%n",s.name,s.avg);
    // }
}
