package pratice2;

public class ascending {
	public static void main (String [] args) {
		int ary [] = {32,12,91,56,7,99};
		for (int j=1;j<ary.length;j++) {
			for(int i=1;i<ary.length;i++) {
				if(ary[i-1]<ary[i]) {
					int temp=ary[i-1];
					ary[i-1]=ary[i];
					ary[i]=temp;
				}
			}
		}
		for (int i=0;i<ary.length;i++) {
			System.out.print(ary[i]+",");
		
		}
	}

}
