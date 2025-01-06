package project04Questionnaire.use;

import project04Questionnaire.IVManager;
import project04Questionnaire.objects.verbs.IVVerb;

public class IVDisplayManager {

	public IVDisplayManager(IVManager _sIVManager) {
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
		System.out.println();
		for (IVVerb lIVVerb : pIVManager.getpIVVerbManager().getpMapInfinitiveToIVVerb().values()) {
			System.out.println(lIVVerb.displayVerb() + " --> " + lIVVerb.getpIVEval());
		}
	}
	
}
