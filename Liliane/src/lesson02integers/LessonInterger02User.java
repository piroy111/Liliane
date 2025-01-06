package lesson02integers;

import basicmethods.BasicPrintMsg;
import basicmethods.BasicString;

public class LessonInterger02User {

	public static void main(String[] args) {
		
		
		String lAsk1;
		String lAsk2;
		System.out.println("Bonjour!Choisissez un nombre");
		
		lAsk1 = BasicPrintMsg.askUser();
		
		System.out.println();
		
		System.out.println("Une autre nombre?");
		
		lAsk2 = BasicPrintMsg.askUser();
		
		int lNombre1;
		int lNombre2;
		lNombre1 = BasicString.getInt(lAsk1);
		lNombre2 = BasicString.getInt(lAsk2);
		System.out.println("La multiplication des chiffres est... ");
		System.out.println(lNombre1 * lNombre2);
		
		
		
		
		
		
	}

	
		 
	}


