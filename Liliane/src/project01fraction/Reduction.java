package project01fraction;

import basicmethods.BasicPrintMsg;
import basicmethods.BasicString;

public class Reduction {

	public static void main(String[] args) {
		/*
		 * TITRE
		 */	
		System.out.println("Reduire une fraction");
		/*
		 * DEMANDER A L UTILISATEUR LE NUMERATEUR ET LE DENOMINATEUR
		 */	
		String lAsk1;
		String lAsk2;
		System.out.print("Entrez le numerateur  : ");
		lAsk1 = BasicPrintMsg.askUser();
		System.out.print("Entrez le denominateur: ");
		lAsk2 = BasicPrintMsg.askUser();
		int lNumerateur;
		int lDenominateur;
		lNumerateur = BasicString.getInt(lAsk1);
		lDenominateur = BasicString.getInt(lAsk2);
		/*
		 * ALGORITHME
		 */
		System.out.println();
		int lCommun;
		lCommun = 2;
		while (lCommun < lNumerateur && lCommun < lDenominateur) {
			/*
			 * DISPLAY
			 */
			System.out.print(">> " + "C= " + lCommun + "; N= " + lNumerateur + "; D= " + lDenominateur);
			/*
			 * SI C/N ET C/D
			 */
			if (lNumerateur % lCommun == 0 && lDenominateur % lCommun == 0) {
				System.out.println(" >> Divise");
				lNumerateur = lNumerateur / lCommun;
				lDenominateur = lDenominateur / lCommun;
			}
			/*
			 * SINON
			 */
			else {
				System.out.println(" >> C -> C+1");
				lCommun = lCommun + 1;
			}
		}
		/*
		 * RENVOIE LA REPONSE
		 */
		System.out.println();
		System.out.println("Reduction= " + lNumerateur + " / " + lDenominateur);
	}
	
	
}
