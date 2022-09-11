package test;

public class swapFirstAndLastWord {
	public static void main(String[] args) {
		
		String word="This is String";
		String ary[]=word.split(" ");
		String temp=ary[0];
		ary[0]=ary[ary.length-1];
		ary[ary.length-1]=temp;

		for (int i=0;i<ary.length;i++) {
			System.out.print(ary[i]);
		}
		
	}

}
