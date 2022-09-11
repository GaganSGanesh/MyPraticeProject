package test;

import java.util.HashSet;

public class RepeatedCharInString {
	public static void main(String [] args) {
		String str="Respected";
		
		HashSet<Character> set=new HashSet();
		for (int i=0;i<str.length()-1;i++) {
			set.add(str.charAt(i));
		}
		for (Character ch:set) {
			int count=0;
			for (int i=0;i<str.length()-1;i++) {
				if(ch.equals(str.charAt(i))) {
				count++;
				}
			}
			System.out.println(ch+" is "+count);
		}
		
	}

}
