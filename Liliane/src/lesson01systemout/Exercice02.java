package lesson01systemout;

import basicmethods.BasicPrintMsg;

public class Exercice02 {

	
	public static void main(String[] _sArgs) {  
		
		String lNom1;
		String lNom2;
		
	    System.out.println("Bonjour!Quel est votre nom de famille?");	
		lNom1 = BasicPrintMsg.askUser();
		
		System.out.println("OK!Quel est votre prenom?");	
		lNom2 = BasicPrintMsg.askUser();
	
		System.out.println(); 
	
	
		System.out.println("bonjour " + lNom2 + " " + lNom1);
		
	
	
	
	
	}
	
	
	
}
