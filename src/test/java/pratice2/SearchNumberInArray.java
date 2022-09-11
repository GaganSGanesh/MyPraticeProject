package pratice2;

public class SearchNumberInArray {
	public static void main(String [] args) {
		int ary [] = {10,33,10,44,00,9}; 
		int count=0;
		for(int i=0;i<ary.length;i++) {
			if(ary[i]==10) {
				count++;
			}
			
		}
		System.out.println("10 EXISTS " +count+ " times");
	}
}


