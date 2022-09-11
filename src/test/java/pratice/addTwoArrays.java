package pratice;

public class addTwoArrays {
	public static void main(String[] args) {
		
	int [] ary1= {10,20,30,50,100,990};
	int [] ary2= {30,50,70,10,90};
	//output should be {40,70,100,60,90}
	
	{
		int count=ary1.length;
		if (count<ary2.length) {
			count=ary2.length;
		}
		for(int i=0;i<count;i++) {
			try {
			System.out.println(ary1[i]+ary2[i]);
			}catch (Exception e) {
				if(ary1.length>ary2.length) {
					System.out.println(ary1[i]);
				}
				else {
					System.out.println(ary2[i]);
					
				}
				
			}
			}
		
	}	
	}
	}
