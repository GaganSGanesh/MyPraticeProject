package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OccuranceOfWord_String {

   public static void main(String[] args) {
		
		String s="My name is is Raj Raj";
		String str[]=s.split(" ");
		
		//create set collection
		HashSet <String> set=new HashSet();
		
		//add all word of string into set
		for(int i=0; i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		//compare each word of set with all the word of string
		for(String word:set)
		{
			int count=0;
			
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					//increment count
					count++;
				}
			}
			//since it is SET type of collection "is" and "raj" is printed twice in the console
			System.out.println(word+" "+count);
		}
	}
}


class DuplicateWords_String
{
    public static void main(String[] args) {
		
		String s="My name is is Raj Raj";
		String str[]=s.split(" ");
		
		//create set collection
		HashSet <String> set=new HashSet();
		
		//add all word of string into set
		for(int i=0; i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		//compare each word of set with all the word of string
		for(String word:set)
		{
			int count=0;
			
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					//increment count
					count++;
				}
			}
			if(count>1)
			System.out.print(word+" ");
		}
	}
}

class UniqueWords_String
{
    public static void main(String[] args) {
		
		String s="My name is is Raj Raj";
		String str[]=s.split(" ");
		
		//create set collection
		LinkedHashSet <String> set=new LinkedHashSet();
		
		//add all word of string into set
		for(int i=0; i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		//compare each word of set with all the word of string
		for(String word:set)
		{
			int count=0;
			
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					//increment count
					count++;
				}
			}
			if(count==1)
			System.out.print(word+" ");
		}
	}
}

class RemoveDuplicateWord_String
{
    public static void main(String[] args) {
		
		String s="My name is is Raj Raj";
		String str[]=s.split(" ");
		
		//create set collection
		LinkedHashSet <String> set=new LinkedHashSet();
		
		//add all word of string into set
		for(int i=0; i<str.length;i++)
		{
			set.add(str[i]);
		}
		for(String word:set)
		{
			System.out.print(word+" ");
		}
    }
}