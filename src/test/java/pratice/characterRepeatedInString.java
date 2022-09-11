package pratice;

import java.util.HashSet;

public class characterRepeatedInString {
	public static void main(String [] args) {
		String word="Repeated";
		HashSet<Character> character=new HashSet();
		for(int i=0;i<word.length()-1;i++) {
			character.add(word.charAt(i));
		}
		for (Character ch:character) {
			int count=0;
			for (int i=0;i<word.length()-1;i++) {
			if(ch.equals(word.charAt(i))){
				count++;
			}
			//run this to see how looping and counting is happening
//			System.out.print(ch+" ,"+count);
			}
			System.out.println(ch+" "+count);
			
			}
		
	}

}
