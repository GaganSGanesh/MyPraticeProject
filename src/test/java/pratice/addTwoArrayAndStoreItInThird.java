package pratice;

public class addTwoArrayAndStoreItInThird {
	public static void main(String[] args) {
		
	int [] ary1= {10,20,30,50,100,990};
	int [] ary2= {30,50,70,10,90};checkthis
	int [] ary3 = {0};
	int temp=0;
	//output should be {40,70,100,60,90}
	
	{
		int count=ary1.length;
		if (count<ary2.length) {
			count=ary2.length;
		}
		for(int i=0;i<count;i++) {
			try {
//			System.out.println(ary1[i]+ary2[i]);
			temp=ary1[i]+ary2[i];
			ary3[i]=temp;
			System.out.println(ary3);
			}catch (Exception e) {
				if(ary1.length>ary2.length) {
//					System.out.println(ary1[i]);
					ary3[i]=ary1[i];
				}
				else {
//					System.out.println(ary2[i]);
					ary3[i]=ary2[i];
					
				}
				
			}
			}
		System.out.println(ary3);
	}	
	}
	}
