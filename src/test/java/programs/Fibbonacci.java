package programs;

public class Fibbonacci {

public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int n3;
		    
		System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(int i=2;i<20;i++)//loop starts from 2 because 0 and 1 are already printed 
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;  
		 }    
	}
}