package project;

public class methodOverRiding {
	public static void main(String[] args) {
		//create object for java class
		java jav=new java();
		jav.displayinfo();
		
		//create object for language class
		
		language lan=new language();
		lan.displayinfo();
		
		

		/*Method Overriding:the same method will perform one operation in the superclass
		and another operation in the subclass.As example,
		 * In the above example, we have created a superclass named Language and
		 *  a subclass named Java. Here, the method displayInfo() is present in both Language and Java
		 * 
		 * 
		 * Note: The method that is called is determined during the execution of the program.
		 *  Hence, method overriding is a run-time polymorphism.
		 * */
	}

}
