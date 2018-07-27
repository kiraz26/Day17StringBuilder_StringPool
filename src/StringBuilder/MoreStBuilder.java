package StringBuilder;

public class MoreStBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// REVERSE
		StringBuilder builder = new StringBuilder();
		builder.append("banana");
		builder.reverse();
		System.out.println(builder);
		builder.reverse();
		System.out.println(builder);

		// check if palindrome
		// refer, level, civic, bob, radar
		builder = new StringBuilder("level");
		// ==, equals --> both of them checks if same object is being pointed
		// we should change a string (.toString)
		if (builder.toString().equals(builder.reverse().toString())) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
		
		StringBuilder st1 = new StringBuilder("hello");
		StringBuilder st2 = new StringBuilder("hello");

		System.out.println(st1.equals(st2)); 
		
		System.out.println(st1.toString().equals(st2.toString()));
		//whenever you want to compare 2 stringBuilder values, 
		//you need to convert it to string first toString() -> method
		//hen use .equals method to compare
		
		st1.append(" friends");
		System.out.println(st1);
		
		
		StringBuilder st4 = new StringBuilder("abc");
		StringBuilder st5 = st4;
		System.out.println(st4 == st5);
		System.out.println(st4.equals(st5));
		
		System.out.println(st4);
		System.out.println(st5);
		
		st5.append(" - def");
		
		System.out.println(st4);
		System.out.println(st5);
		
		//String --> StringBuilder how to convert to StringBuilder
		
		String str="abcd";
		StringBuilder stb6= new StringBuilder();
		stb6.append(str);
		
		//
		StringBuilder[] stArrays = new StringBuilder[5];
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
