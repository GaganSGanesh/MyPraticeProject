package pratice2;

public class addTwoArray {
	public static void main(String[] args) {
		

	int [] ary1= {10,30,55,90,108};
	int [] ary2= {110,310,55,920,108};
	
	if(ary2.length >ary1.length) {
		
		for(int i=0;i<ary2.length;i++) {
			try {
			System.out.print(ary1[i]+ary2[i]+",");
			}catch (Exception e) {
				System.out.print(ary2[i]+",");
			}
		}
		
	}else {
		for(int i=0;i<ary1.length;i++) {
		try {
			System.out.print(ary1[i]+ary2[i]+",");
			}catch (Exception e) {
				System.out.print(ary1[i]+",");
			}
		}
	}
		
	
	
	}
}
