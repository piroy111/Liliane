package lesson01systemout;

import basicmethods.BasicPrintMsg;

public class LaunchLesson01 {

	public static void main(String[] _sArgs) {
		
		while (true) {
			System.out.println("Enter a number: ");
			String lAnswer = BasicPrintMsg.askUser();
			System.out.println("Answer= " + lAnswer);
			System.out.println();
		}
	}


}
