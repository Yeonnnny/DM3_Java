package timetest;

interface Sample{
	
	public int add(int x, int y);
	
}


public class AnonymousClassTest {

	public static void main(String[] args) {
		
		Sample s  = new Sample() {
			
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
		s.add(10, 100);
		System.out.println(s.add(10, 20));

		Sample s2  = new Sample() {
			
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
		
		System.out.println(s2.add(10, 20));
		
		
	} // end main
	
}


