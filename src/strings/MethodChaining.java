package strings;

public class MethodChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lan=" Java ";
		lan=lan.trim().toLowerCase().substring(2).replace("v", "V");
		System.out.println(lan);
		
		String month="December";
		month.toUpperCase().replace("E", "e").replace("MB", "").length();
		
		
	}

}
