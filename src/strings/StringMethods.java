package strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// charAt, indexOf
		String lan = "Java";
		System.out.println(lan.charAt(0));
		char first = lan.charAt(0);

		lan.indexOf("v");
		System.out.println(lan.indexOf("v"));

		// move to position first then start search from there
		System.out.println(lan.indexOf("a", 2));

		System.out.println(lan.charAt(lan.indexOf("J")));

		// print last character by using nesting. length()
		System.out.println(lan.charAt(lan.length() - 1));

		// Substring
		// 1)substring(startIndex) --> it will cut the string from that index until end
		// 2)substring(startIndex, endIndex) --> specify range to cut string

		String tool = "hammer set";

		System.out.println(tool.substring(3));
		System.out.println(tool.substring(2, 4));

		// nest: find position of space then cut until end of string
		System.out.println(tool.substring(tool.indexOf(" ") + 1));

		// startWith --> check if beginning and return boolean

		String pageTitle = "wooden spoon - Google Search";

		if (pageTitle.startsWith("wooden spoon") && pageTitle.endsWith("Google Search") && pageTitle.contains("-")) {
			System.out.println("Step passed");
		} else {
			System.out.println("Step failed");
		}

		// get rid of space and merge
		String search = "wooden spoon";
		// 1) replace method
		System.out.println(search.replace(" ", ""));
		// 2) split 
		String[] array = search.split(" ");
		System.out.println(array[0]+array[1]);
		// 3) find the position of space and use 2 substring
		search.substring(0, search.indexOf(" "));
		search.substring(search.indexOf(" ")+1, search.length()-1);

		System.out.println(search.substring(0, search.indexOf(" ")));
		System.out.println(search.substring(search.indexOf(" ")+1, search.length()));
		System.out.println(search.substring(0, search.indexOf(" "))+search.substring(search.indexOf(" ")+1));
	}

}
