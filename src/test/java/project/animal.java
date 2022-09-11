package project;

public class animal{
class animal {
	void noise() {
		System.out.println("meow");
	}
}
class cat extends animal {
	void noise() {
		System.out.println("meow");
	}
}
class dog extends animal {
	void noise() {
		System.out.println("bow");
	}
}
class cow extends animal{
	void noise() {
		System.out.println("mow");
	}
}
class simulator{
	static void ansim(animal a) {
	a.noise();
	}
	}
class maincalss{
	public static void main(String [] args) {
		cat c=new cat();
		dog d=new dog();
		cow cw=new cow();
		simulator.ansim(c);
		simulator.ansim(d);
		simulator.ansim(cw);
	}
}
