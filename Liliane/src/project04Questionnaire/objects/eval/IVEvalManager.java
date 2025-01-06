package project04Questionnaire.objects.eval;

import project04Questionnaire.IVManager;
import project04Questionnaire.objects.verbs.IVVerb;

public class IVEvalManager {

	public IVEvalManager(IVManager _sIVManager) {
		pIVManager = _sIVManager;
	}
	
	/*
	 * Data
	 */
	private IVManager pIVManager;
	
	/**
	 * 
	 * @param _sKey
	 * @return
	 */
	public final IVEval createIVEval(String _sKey) {
		return new IVEval(_sKey);
	}
	
	/**
	 * 
	 * @param _sIVVerb
	 * @return
	 */
	public final IVEval createIVEval(IVVerb _sIVVerb) {
		return new IVEval(_sIVVerb.getpInfinitive());
	}

	/*
	 * Getters & Setters
	 */
	public final IVManager getpIVManager() {
		return pIVManager;
	}
	
	
}
