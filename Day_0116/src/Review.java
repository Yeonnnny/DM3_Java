public class Review {

	public static void main(String[] args) {

		// int i =5, j=0;
		
		// j = i ++;
		// System.out.println("j=i ++ 실행 후 : i  = "+i +", j = "+j);
		
		// i =5;  //결과 비교를 위해 처음과 같은 값으로 변경

		// j=0;
		
		// j = ++i ;
		// System.out.println("j=++i  실행 후 : i  = "+i +", j = "+j);

		// int i  =5, j=5; 
		// System.out.println(i ++);
		// // System.out.println(i );
		// // i ++;
		// System.out.println(++j);
		// System.out.println("i  = "+i +", j = "+j);		
		

		// int i = -10;
		// i = +i ;
		// System.out.println(i );

		// i = -10;
		// i = -i;
		// System.out.println(i);

		double d = 85.4;
		int score = (int)d;
		System.out.println("score = "+score);
		System.out.println("d = "+d+"\n");

		System.out.println(5/2);
		System.out.println(5/2.0);
		System.out.println();

		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println();


		String str1 = "abc";
		String str2 = new String("abc");

		System.out.printf("\"abc\"==\"abc\" ? %b%n","abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n",str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n",str2=="abc");
		System.out.printf(" str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf(" str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf(" str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf(" str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		System.out.println();

		int i = 4 ;
		boolean result =  (i%2==0 || i%3==0) && !(i%6==0);
		result = (i%2==0 || i%3==0) && i%6!=0;
		System.out.println(result);
		
		int x = 1;
		int y = 0;

		y = ++x; // x:2, y:2

		x=1;
		y=0;

		y = x++; // x:2, y:1

		int xx, yy, zz ;
		int absX, absY, absZ;
		char signX, signY, signZ;

		xx=10;
		yy=-5;
		zz=0;

		absX = xx>=0? xx:-xx;
		absY = yy>=0? yy:-yy;
		absZ = zz>=0? zz:-zz;

		signX = xx>0? '+':(xx==0? ' ':'-'); 
		signY = yy>0? '+':(yy==0? ' ':'-'); 
		signZ = zz>0? '+':(zz==0? ' ':'-'); 

		System.out.printf("x = %c%d%n",signX,absX);
		System.out.printf("y = %c%d%n",signY,absY);
		System.out.printf("z = %c%d%n",signZ,absZ);

		char c = 'A';
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		int n = 111;
		System.out.println((n/100)*100);
		System.out.println("\n\n");


		int numApple = 123;
		int sizeBucket = 10;
		int numBucket = ((numApple%sizeBucket)==0)? numApple/sizeBucket : (numApple/sizeBucket)+1;
		System.out.println(numBucket+"\n\n");

		int num=0;
		System.out.println((num>0)?"양수":(num<0)? "음수": "0" + "\n\n");

		int fah = 100;
		float cel = (int)((5/9f*(fah-32))*100 +0.5)/100f;
		System.out.println(cel);




	}

}
