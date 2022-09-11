package project;

	class ProgrammingLanguage {
		  public void display() {
		    System.out.println("I am Programming Language.");
		  }
		}

		class JavaCls extends ProgrammingLanguage {
		  @Override
		  public void display() {
		    System.out.println("I am Object-Oriented Programming Language.");
		  }
		}

		class Main {
		  public static void main(String[] args) {

		    // declare an object variable
		    ProgrammingLanguage pl;

		    // create object of ProgrammingLanguage
		    pl = new ProgrammingLanguage();
		    pl.display();

		    // create object of Java class
		    pl = new JavaCls();
		    pl.display();
		  }
		}
/*
 * A variable is called polymorphic if it refers to different values under different conditions
 * In statement pl = new ProgrammingLanguage(), pl refer to the object of the ProgrammingLanguage class.
And, in statement pl = new Java(), pl refer to the object of the Java class.
 */
