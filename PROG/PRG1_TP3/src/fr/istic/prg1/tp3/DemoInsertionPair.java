package fr.istic.prg1.tp3;

import java.util.Scanner;

public class DemoInsertionPair {

	public static void main(String[] args) {
		
		/*
		 * D�monstration de la classe InsertionPair avec utilisations des m�thoes et affichage des resultats
		 */
		
		InsertionPair a= new InsertionPair();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Veuillez entrer les valeurs de votre tableau par Pair:");
		a.createArray(s);
		System.out.println("Voici le tableau tri� :");
		System.out.println(a.toString());
		System.out.println("Choisisser une valeur � ins�rer :");
		int x = s.nextInt();
		int y = s.nextInt();
		a.insert(new Pair(x,y));
		System.out.println("Voici le tableau tri� apr�s insertion de [ "+ x +" "+ y + " ] :");
		System.out.println(a.toString());
	}
}
