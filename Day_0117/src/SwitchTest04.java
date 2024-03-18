public class SwitchTest04 {
    public static void main(String[] args) {
        String yoil = "화";
        double calories = 0;
        // yield : 문장과 값을 혼용해서 사용이 가능함, 즉 switch식에서도 statement도 사용가능
        calories = switch(yoil){
            case "월","수","금" :
                System.out.println(yoil+"요일 운동 : 에어로빅");
                yield 664.7;
            case "화","목","토" :
                System.out.println(yoil+"요일 운동 : 수영");
                yield 528;
            default:
                System.out.println(yoil+"요일 운동 : 없음");
                yield 0;
        };
        System.out.println("소비 칼로리 : "+calories+"kcal");


    }
}
