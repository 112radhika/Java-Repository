package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java Program";
		
		//Method 1: length() - to find the length of a string
		System.out.println(s.length());
		
		//Method 2: charAt() - to find character at particular index position
		System.out.println(s.charAt(5));
		
		//Method 3: valueOf() - converts different datatypes into string
		int a = 10;
		String b = String.valueOf(a);
		System.out.println(b);
		
		//Method 4: equals() - compares two string values but it is case sensitive
		System.out.println(s.equals("Java"));
		
		//Method 5: equalIgnoreCase() - compares two string values but it ignore case
		System.out.println(s.equalsIgnoreCase("java Program"));
		
		//Method 6: isEmpty() - check whether the string is empty or not
		String s1 = "";
		System.out.println(s1.isEmpty());
		System.out.println(s.isEmpty());
		
		//Method 7: toLowerCase() - converts the string to lowercase
		System.out.println(s.toLowerCase());
		
		//Method 8: toUpperCase() - converts the string to uppercase
		System.out.println(s.toUpperCase());
		
		//Method 9: contains() - check the presence of a given text. case sensitive
		System.out.println(s.contains("ava"));
		
		//Method 10: concat() - used to join two strings
		String s2 = " Class";
		System.out.println(s.concat(s2));
				

	}

}
