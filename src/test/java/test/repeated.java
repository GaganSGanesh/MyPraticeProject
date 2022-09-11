package test;

import java.util.HashSet;
import java.util.Scanner;

public class repeated {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input");
		String str = sc.nextLine();
		String[] Saryy = str.split(" ");

		HashSet<String> set = new HashSet();

		for (int i = 0; i < Saryy.length; i++) {
			set.add(Saryy[i]);
		}
		for (String word : set) {
			int count=0;
			for (int i=0;i<Saryy.length;i++) {
				if(word.equals(Saryy[i])) {
					count++;
				}
			}
			System.out.println(word +"    is repeated "+count +" times");
		}

	}

}
