package project;

public class methodOverLoad {
	public void display(char symbol) {
		for (int i=0;i<=9;i++) {
			System.out.print(symbol);
		}
	}
		public void display() {
			for (int i=0;i<=9;i++) {
				System.out.print("*");
			}
		}
		public static void main(String[] args) {
			//create object
			methodOverLoad mol=new methodOverLoad();
			
			mol.display();
			System.out.print("\n");
			mol.display('#');
			
			/*Method Overloading:the same method will perform different operations based on the parameter
			 * 
			 * Note: The method that is called is determined by the compiler. 
			 * Hence, it is also known as compile-time polymorphism.
			 */
		}
	}




