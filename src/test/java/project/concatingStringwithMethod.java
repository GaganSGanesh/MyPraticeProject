package project;

public class concatingStringwithMethod {
	static String s1="abc";
	static String s2="pqr";
	static String s3="xyz";
	public static void main(String[] args) {
//		System.out.println(s1+s2+s3);
		//using inbuilt function
//		s1.concat(s2+s3);
//		or
		System.out.println(s1.concat(s2).concat(s3));

	}

}
