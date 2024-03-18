package mypackage2;

public class BankAccount {
    private String name;
    private String no;
    private int balance;

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    //getter 
    public String getName(){
        return this.name;
    }
    public String getNo(){
        return this.no;
    }
    public int getBalance(){
        return this.balance;
    }

    // 일반 메소드
    // 입금
    public void deposit(int money) {
        balance+=money;
        System.out.println("### 입금 완료 ###");
    }

    // 출금
    public void withraw(int money) {
        if(balance==0){
            System.out.println("잔고가 0원입니다. 메뉴 선택으로 돌아가겠습니다.");
        }else{
            if(money>balance){
                System.out.println("출금가능 금액을 벗어났습니다.\n메뉴를 다시 선택해주세요.");
            }else{
                balance-=money;
                System.out.println("### 출금 완료 ###");
            }
        }

    }

    // 출력
    public void output() {
        System.out.printf("%s님(%s)의 잔고 : %,d원%n", name,no,balance);
    }

}
