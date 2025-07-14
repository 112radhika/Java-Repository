package string;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("java");
		StringBuffer s2 = new StringBuffer("malayalam");
		StringBuffer s3 = new StringBuffer(s1);
		StringBuffer s4 = new StringBuffer(s2);
		s1.reverse();
		s2.reverse();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
//toString() - meaningful comparison of string
		if(s1.toString().equals(s3.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		if(s2.toString().equals(s4.toString())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
