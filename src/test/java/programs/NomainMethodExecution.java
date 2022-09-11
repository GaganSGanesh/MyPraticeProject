package programs;

public class NomainMethodExecution {

	//from java 7 jvm will checck for main method block wont run alone
	static {
		System.out.println("I am method in a class without Main Method");
	}
	
	void mymethod(){
		System.out.println("IIB");
	}
	public static void main(String[] args) {
		System.out.println("main");
	}
}
