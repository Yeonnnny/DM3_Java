public class SwitchTest03 {
    public static void main(String[] args) {
        String yoil ="월";

        switch (yoil) {
            case "월","수","금"->System.out.println("요가");
            case "화","목","토"->System.out.println("수영");
            default->System.out.println("달리기");
        } // lambda 사용

        // switch 식
        String result = switch (yoil) {
            case "월","수","금" ->"요가";
            case "화","목","토" ->"수영";
            default -> "달리기";
        }; // !!! 세미콜론 필수 !!!!

        System.out.println(yoil+"요일 운동 "+result);
        
    }
    
}
