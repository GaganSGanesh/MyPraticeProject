package pratice2;

import java.util.HashSet;

public class RepeatdWordWithCommaSpace {
	public static void main(String[] args) {
		String s="This is a String, this with comma comma String";
//		without comma in the split statement, it wont consider the word after comma , even 
//		if it is repeated .
		String split []=s.split("[, ]");
		
		HashSet<String> set=new HashSet();
		for(int i=0;i<split.length;i++) {
		set.add(split[i]);
	}
		
		for(String word:set) {
			int count=0;
			for(int i=0;i<split.length;i++) {
			if(word.equals(split[i])) {
				count++;
			}
			}
			if(count>=2) {
				System.out.println(word);
			}
		}
		
	}
}
