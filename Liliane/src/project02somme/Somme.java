package project02somme;

import basicmethods.BasicPrintMsg;
import basicmethods.BasicString;

public class Somme {

	public static void main(String[] args) {

		/* 
		 * pose une question a l'utilisateur
		 */

		String lAsk;
		System.out.println("Bonjour!Choisisez un nombre N");
		lAsk =  BasicPrintMsg.askUser();
		int lNombre;
		lNombre = BasicString.getInt(lAsk);
		/*
		 * calcul de la somme
		 */
		int lSomme;
		lSomme = 0;
		for (int lIdx = 0; lIdx <= lNombre; lIdx = lIdx + 1) {

			

			
			lSomme = lSomme + lIdx;


			System.out.println("lIdx = " + lIdx + "; lSomme= " + lSomme); 











		}
		/*
		 * Resultat
		 */
		System.out.println();
		System.out.println("Resultat= " + lSomme);
	}
}