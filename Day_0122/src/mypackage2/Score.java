package mypackage2;

public class Score {
    
    private String id; // 멤버변수, 인스턴스변수
    private String name;
    private int kor;
    private int eng;
    private int math;
    private double avg;

    // setter : 우리 멤버 변수의 값을 변경하는 용도
    // public 타입 setId(String i) {id=i;}
    public void setId(String i) {
        id = i;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setKor(int k) {
        kor = k;
    }
    
    public void setEng(int e) {
        eng = e;
    }
    
    public void setMath(int m) {
        math = m;
    }
    
    // getter : 우리 멤버 변수의 값을 반환하는 용도
   
    

    public void calcAvg() {
        avg = (kor + eng + math) / 3.0;
    }

    public void output() {
        System.out.printf("%s : %.2f%n", name, avg);
    }

}
