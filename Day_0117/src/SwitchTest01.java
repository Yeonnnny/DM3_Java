public class SwitchTest01 {
    public static void main(String[] args) {
        int score = 100;
        String clz = null; // : 아무것도 참조하고 있지 않다는 의미 , "": 참조는 하는데 빈 문자열임을 의미
        

        switch (score / 10) { // switch(조건문) : 조건문은 정수 or 문자열,  case : 분기점 
            case 10:  // 아무것도 안걸려서 case 9의 실행 공유 -> break
            case 9:
                clz = "A학점";
                break;
            case 8:
                clz = "B학점";
                break;
            case 7:
                clz = "C학점";
                break;
            case 6:
                clz = "D학점";
                break;
            default:
                clz = "F학점";
        }

        System.out.println(clz);
    }

}
