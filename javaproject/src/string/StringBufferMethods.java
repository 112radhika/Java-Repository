package string;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s1 = new StringBuffer("Hello");
		
		//Method 1: append() - used to add values at the end of a string
		s1.append(" World");
		System.out.println(s1);
		//System.out.println(s1.append(" World"));
		
		//Method 2: insert() - used to enter string or character at specified index
		s1.insert(5, " Java");
		System.out.println(s1);
		
		//Method 3: replace() - give start and end+1 index (eg: Hello)
		s1.replace(0, 5, "Hai");
		System.out.println(s1);
		
		//Method 4: delete()  - give start and end+1 index (eg: Hai )
		s1.delete(0,4);
		System.out.println(s1);
		
		//Method 5: capacity()
		StringBuffer s2 = new StringBuffer(""); // empty string
		s2.capacity();
		System.out.println(s2.capacity());// 16 is the default value of empty string      
		System.out.println(s1.capacity()); // 16 + 5 = 21. Capacity will consider the first initialized value of s1 ie "Hello" not the current value "Java World"
		System.out.println(s1.length()); //Consider the length of the current string "Java World"
		
		//Method 6: charAt()
		System.out.println(s1.charAt(5)); //find character at particular index position
		
		//Method 7: substring()
		System.out.println(s1.substring(5)); // World - It won't change the original string
		System.out.println(s1.substring(0,4)); // Java
		
		//Method 8: reverse()
		System.out.println(s1.reverse());// s1 = dlroW avaJ
		System.out.println(s1.reverse());// s1 = Java World

	
		

	}

}
