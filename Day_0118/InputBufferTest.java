import java.util.Scanner;

public class InputBufferTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in : 입력 버퍼 생성

        // int i ;
        // while(true){
        // System.out.print("값 입력 : ");
        // i = scanner.nextInt(); // nextLint():키보드의 입력이 아닌 입력 퍼버의 값을 가져감
        // // nextInt() : WhiteSpace(\t,\n,space)는 무시하고 int형 값만 가져옴
        // System.out.println("입력한 값 ==> "+i);
        // scanner.nextLine(); // 목적 : 버퍼 비우기, 버퍼에 남아있는 값을 가지고만 와서 메모리에 넣지 않으므로 나머지 값들은
        // 그냥 버려짐
        // }

        // String data;
        // while(true){
        // System.out.print("값 입력 : ");
        // // data = scanner.next();// next():키보드의 입력이 아닌 입력 퍼버의 값을 가져감
        // // // next() : WhiteSpace(\t,\n,space)는 무시하고 String 값 즉, 단어만 가져옴
        // data = scanner.nextLine(); // nextline() : space나 탭을 문자열로 인식함. 엔터 전까지의 값을
        // 가져옴.
        // // nextLine() : 엔터 전까지의 값을 모두 가져오므로 입력버퍼가 비워짐.
        // System.out.println("입력한 값 ==> "+data);
        // }

        String data;

        System.out.print("값 입력-1 : ");
        data = scanner.next(); 
        System.out.println("입력한 값-1 ==> " + data);
        // scanner.nextLine(); // 입력버퍼를 비워주면 nextLine()에서 새로운 값을 입력받을 수 있음

        System.out.print("값 입력-2 : ");
        data = scanner.nextLine(); // next()는 입력한 값만 가져오고, 버퍼에는 엔터만 남게됨. 그래서 nextLine()은 입력버퍼에 남아있는 엔터를 가져옴.
        System.out.println("입력한 값-2 ==> " + data);

        System.out.println("End");
        
        
    }
}
