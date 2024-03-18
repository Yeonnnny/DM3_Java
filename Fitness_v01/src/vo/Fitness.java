package vo;

public class Fitness {
    private String id;
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String result;

    
    public Fitness(){} // 메모리 확보 후 초기화


	public Fitness(String id, String name, double height, double weight) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        calcBMI();

    }  

    public String getId() {
		return this.id;
	}

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
        calcBMI();  //
    }
    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        calcBMI();
    }

    public double getBmi() {
        return bmi;
    }

    public String getResult() {
        return result;
    }


    // 일반 메소드
    private void calcBMI(){
        this.bmi = weight/(height*height*0.0001);
        calcResult();
    }
    
    private void calcResult(){
        if(bmi>=35) result =" 고도비만";
        else if(bmi>=30) result="중도 비만";
        else if(bmi>=25) result="경도 비만";
        else if(bmi>=23) result="과체중";
        else if(bmi>=18.5) result="정상";
        else result = "저체중";
    }
    

    public void output(){
        System.out.printf("%nID : %s(%s), %.2fcm, %.2fkg, %.2f, %s%n%n",this.id,this.name,this.height,this.weight,this.bmi,this.result);
    }
    


}
