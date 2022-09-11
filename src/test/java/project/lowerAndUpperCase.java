package project;
public class lowerAndUpperCase {
	public static void main(String[] args) {
		String str="welCOME to aUTOmation";
		String upper="";
		String lower="";
		int countU=0;
		int countL=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (ch>=65 && ch<=90)
			{
				upper=upper+ch;
				countU++;
			}
			else
			{
				lower=lower+ch;
				countL++;
			}
		}
		System.out.println("Upper char "+upper+" and the count is "+countU);
		System.out.println("lower char "+lower+" and the count is "+countL);		
	}
}
