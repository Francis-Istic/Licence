package Animaux;

public class Lion extends Felins {

	public Lion(String nom, int age) {
		super(nom, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString() + "C'est un Lion. ";
	}

}
