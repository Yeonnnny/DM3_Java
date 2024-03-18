package mypackage;

// VO (Value Object) 
// static이 붙은 것은 우리 멤버가 아님
public class Score {
    // 아이디. 이름. 국어, 영어, 수학, 평균, 합계
    String id; // 멤버변수, 인스턴스변수
    String name;
    int kor;
    int eng;
    int math;
    double avg;

    public void calcAvg(){
        avg = (kor+eng+math)/3.0;
    }

    public void output(){
        System.out.printf("%s : %.2f%n",name,avg);
    }

}
