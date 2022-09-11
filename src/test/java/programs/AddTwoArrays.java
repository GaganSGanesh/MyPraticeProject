package programs;

public class AddTwoArrays {

	public static void main(String[] args) {

		int a[]= {13,2,7,4};
		int b[]= {31,11,33,56,7};
		
		int count=a.length;
		
		if(count<b.length)
		{
			count=b.length;
		}
		for(int i=0;i<count;i++)
		{
			try {
				System.out.println(a[i]+b[i]);
			}
			catch(Exception e)
			{
				if(a.length>b.length) {
					System.out.println(a[i]);
				}
				else
					System.out.println(b[i]);
			}
		}
	}

}