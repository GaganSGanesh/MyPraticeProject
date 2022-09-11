package programs;

public class reverseUsingArray {
	public static void main(String[] args) {
		String str="This is String";
		char [] charray=str.toCharArray();
		for (int i=charray.length-1;i>=0;i--) {
			System.out.print(charray[i]);
			
		}
	}

}
