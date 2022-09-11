package project;

public class vowelsInTheString {
	public static void main(String[] args) {
//		String vowels="There is a apple on the table";
		System.out.println(IsVowelPresent("apple"));
		System.out.println(IsVowelPresent("Airpods"));
		
	}
		public static boolean IsVowelPresent(String input) {
			return input.toLowerCase().matches(".*[a]*.");
	}

}
