package myexception;

public class MemberException extends Exception {

	private static final long serialVersionUID = 1L; // 객체 직렬화할 때 사용

	public MemberException(String message) {
		super(message);
	}
	
}
