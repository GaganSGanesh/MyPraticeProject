package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OccuranceOfEachChar_String {

	public static void main(String[] args) {
		
		String s="Raaj";
		
		//create set collection
		HashSet <Character> set=new HashSet();

		//add all char of string into set
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		//compare each char of set with all the char of string
		for(Character ch:set)
		{
			int count=0;
			
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					//increment count
					count++;
				}
			}
			System.out.println(ch+" is present "+count+" times");
		}
	}
}

class DuplicateChars_String{
	
	public static void main(String[] args) {
		
        String s="Raaj";
		
		//create set collection
		HashSet <Character> set=new HashSet();

		//add all char of string into set
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		//compare each char of set with all the char of string
		for(Character ch:set)
		{
			int count=0;
			
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					//increment count
					count++;
				}
			}
			if(count>1)
			System.out.println(ch);
		}	
	}
}

class UniqueChar_String
{
public static void main(String[] args) {
		
        String s="Raaj";
		
		//create set collection
		LinkedHashSet <Character> set=new LinkedHashSet();

		//add all char of string into set
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		//compare each char of set with all the char of string
		for(Character ch:set)
		{
			int count=0;
			
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					//increment count
					count++;
				}
			}
			if(count==1)
			System.out.println(ch);
		}	
	}
}

class RemoveDuplicateChar_String
{
     public static void main(String[] args) {
		
        String s="Raaj";
		
		//create set collection
		LinkedHashSet <Character> set=new LinkedHashSet();

		//add all char of string into set
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(Character ch:set)
		{
			System.out.print(ch);
		}
     }
}