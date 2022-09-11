package pratice2;

import java.util.HashSet;

public class chracterRepeated {
	public static void main(String[] args) {
		String word="ThisisMe";
		
		HashSet<Character> set=new HashSet();
		for (int i=0;i<word.length();i++) {
			set.add(word.charAt(i));
		}
	
		for(Character newloop:set) {
			int count=0;
		
			for(int j=0;j<word.length();j++) {
			if(newloop.equals(word.charAt(j))) {
				count++;
				
			}
			

			}
			System.out.println(newloop+ " "+ count );
		}
	
	}

}
