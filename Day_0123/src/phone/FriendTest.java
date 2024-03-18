package phone;

public class FriendTest {
    public static void main(String[] args) {
        FriendVO friend1 = new FriendVO();
        friend1.output();
        
        FriendVO friend2 = new FriendVO("사오정","010-1111-1111","01.01.01",24); //생성자 호출
        friend2.output();

        

        
    }
    
}
