package phone;

public class FriendVO {
    // 이름, 전화번호, 생년월일. 나이
    private String name;
    private String phoneNo;
    private String birthday;
    private int age;

    // Constructor 메소드 : 개발자가 생성자 만들지 않으면 JVM이 만듦
    // 기본생성자
    // FriendVO vo = new FriendVO();  // 앞에 FriendVO는 클래스에 해당하는 것이고 뒤의 FriendVO()는 생성자임
    public FriendVO(){} // 무조건 만들어야 함

    // 생성자 오버로딩
    public FriendVO(String name, String phoneNo, String birthday, int age) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.birthday = birthday;
        this.age = age;
    }
    

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

     // 츨력 메소드
     public void output(){
        System.out.printf("%s (%d세, %s) : %s%n",this.name,this.age,this.birthday,this.phoneNo);
     }
    
}
