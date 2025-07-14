package string;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello";
		String s1 = "Hello";
		
		String s2 = new String("Hello");
		String s3 = new String("Hello");
		
		System.out.println(s==s1); // == compares the object
		System.out.println(s2==s3);
		System.out.println(s==s3);
		System.out.println(s.equals(s3)); // .equals compares the value of the string. It is case sensitive

	}

}
