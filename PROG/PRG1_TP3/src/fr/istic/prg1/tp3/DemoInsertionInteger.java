package fr.istic.prg1.tp3;

import java.util.Scanner;

public class DemoInsertionInteger {

	public static void main(String[] args) {
		
		/**
		 * D�monstration de la classe InsertionInteger avec utilisations des m�thoes et affichage des resultats
		 */
		
		InsertionInteger a= new InsertionInteger();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Veuillez entrer les valeurs de votre tableau :");
		a.createArray(s);
		System.out.println("Voici le tableau tri� :");
		System.out.println(a.toString());
		System.out.println("Choisisser une valeur � ins�rer :");
		int n = s.nextInt();
		a.insert(n);
		System.out.println("Voici le tableau tri� apr�s insertion de "+ n +" :");
		System.out.println(a.toString());
		
	}
}
