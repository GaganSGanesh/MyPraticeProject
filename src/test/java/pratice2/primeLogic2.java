package pratice2;

public class primeLogic2 {
	public static void main(String[] args) {

int no=47;
int count=0;
boolean flag;
for (int i=2;i<no;i++) {
	
	if (no%i==0) {
		count++;
	}
}
if(count>=1) {
	System.out.println("Not Prime");
}
else {
	System.out.println("Prime");
}
}
}
	
