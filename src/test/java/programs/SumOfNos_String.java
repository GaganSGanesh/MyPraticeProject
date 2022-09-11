package programs;

public class SumOfNos_String {

	public static void main(String[] args) {

		String s="raj@132";
		int sum=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sum=sum+s.charAt(i)-'0';
			}
		}
		System.out.println(sum);
	}

}