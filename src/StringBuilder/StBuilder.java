package StringBuilder;

public class StBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		StringBuilder sb = new StringBuilder(); // create empty stringbuilder
		sb.append("Hello");
		
		System.out.println("sb = " + sb);
		sb.append(" World"); //Hello World
		System.out.println("sb = "+sb);
		
		//2
		StringBuilder sentence = new StringBuilder("StringsBuilder is mutable.");
		System.out.println("sentence = "+sentence);
		
		//add one more sentence
		sentence.append(" String is immutable.");
		System.out.println(sentence);
		
		StringBuilder email = new StringBuilder();
		email.append("Hello Friend,\n\n");
		email.append("	How is everything going?");
		email.append(" It has been a long time since we spoke.\n");
		email.append("Basim belada! Silahimi unutmusum helada! Nerden baksan tutarsizlik.");
		email.append("\n\nSincerely,\n");
		email.append("Halo");
		System.out.println(email);
		
		//INSERT
		StringBuilder stb = new StringBuilder("Programming");
		stb.insert(0, "Java "); // add "Java " to the beginning
		System.out.println(stb);
		
		//Java - Programming
		stb.insert(5, "- ");
		System.out.println(stb);
		
		//delete 
		stb.delete(0, 5);
		System.out.println(stb);
		
		//length()
		System.out.println(stb.length());
		
		//charAt, indexOf, substring
		System.out.println(stb.charAt(0));
		System.out.println(stb.substring(0, 5));
		
		
		//reverse
		stb.reverse();
		System.out.println(stb);
		
		
		
		
	}

}
