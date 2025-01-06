package lesson01systemout;

import basicmethods.BasicPrintMsg;

public class Lesson02QuestionToUser {
	public static void main(String[] _sArgs) {  
		
		String lNom;
		
		
		
		
		
		System.out.println("Bonjour!Quel est votre nom?");	
		lNom = BasicPrintMsg.askUser();
		
		System.out.println();
		
		System.out.println("bonjour " + lNom);
		
	}
	
}
