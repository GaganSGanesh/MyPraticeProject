package pratice;

import java.util.HashSet;

public class OccuranceOfWord_String {

	public static void main(String[] args) {
		String s = "My name Raj Raj";
		String str[] = s.split(" ");
		// create set collection
		HashSet<String> set = new HashSet();
		for (int i = 0; i <= str.length - 1; i++) {
			set.add(str[i]);
		}
		// compare each word of set with all the word of string
		for (String word : set) {
			int count = 0;
			for (int i = 0; i < str.length; i++) {
				if (word.equals(str[i])) {
					// increment count
					count++;
				}	}
			// since it is SET type of collection "is" and "raj" is printed twice in the
			// console
			System.out.println(word + " " + count);
		}}}