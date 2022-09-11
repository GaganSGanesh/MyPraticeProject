package project;

public class reverseStr {
	public static void main(String[] args) {
		String str="123";
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		sb.replace(0, 3, "hey");
		System.out.println(sb);
	}

}
