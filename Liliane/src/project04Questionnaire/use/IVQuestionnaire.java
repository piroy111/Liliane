package project04Questionnaire.use;

import java.util.Scanner;

import project04Questionnaire.IVManager;
import project04Questionnaire.objects.verbs.IVVerb;

public class IVQuestionnaire {

	public IVQuestionnaire(IVManager _sIVManager) {
		pIVManager = _sIVManager;
	}
	
	/*
	 * Data
	 */
	private IVManager pIVManager;
	
	/**
	 * 
	 */
	public final void run() {
		Scanner lScanner = new Scanner(System.in);
		for (int lIdx = 0; lIdx < 5; lIdx++) {
			int lIdxVerb = (int) (pIVManager.getpIVVerbManager().getpListIVVerb().size() * Math.random());
			IVVerb lIVVerbToAsk = pIVManager.getpIVVerbManager().getpListIVVerb().get(lIdxVerb);
			System.out.println(lIVVerbToAsk.getpInfinitive());
			/*
			 * Ask PRETERIT
			 */
			System.out.print("Preterit? ");
			lIVVerbToAsk.countEval(lScanner.nextLine(), lIVVerbToAsk.getpPreterit());
			/*
			 * Ask PARTICIPE
			 */
			System.out.print("Participe? ");
			lIVVerbToAsk.countEval(lScanner.nextLine(), lIVVerbToAsk.getpParticipe());
			System.out.println();
		}
		lScanner.close();
	}
	
	
}
