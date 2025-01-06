package project04Questionnaire.objects.verbs;

import project04Questionnaire.objects.eval.IVEval;

public class IVVerb {

	protected IVVerb(String _sInfinitive, IVVerbManager _sIVVerbManager) {
		pInfinitive = _sInfinitive;
		pIVVerbManager = _sIVVerbManager;
		/*
		 * 
		 */
		pIVEval = pIVVerbManager.getpIVManager().getpIVEvalManager().createIVEval(this);
	}
	
	/*
	 * Data
	 */
	private String pInfinitive;
	private IVVerbManager pIVVerbManager;
	private String pPreterit;
	private String pParticipe;
	private IVEval pIVEval;
	
	/**
	 * 
	 * @param _sPreterit
	 * @param _sParticipe
	 */
	protected final void declareNewData(String _sPreterit, String _sParticipe) {
		pPreterit = _sPreterit;
		pParticipe = _sParticipe;
	}
	
	/**
	 * 
	 * @param _sAnswer
	 * @param _sExpected
	 */
	public final void countEval(String _sAnswer, String _sExpected) {
		if (_sAnswer.equals(_sExpected)) {
			pIVEval.addNewValue(1);
			System.out.println (" --> yes");
		} else {
			pIVEval.addNewValue(0);
			System.out.println (" --> error, I expected= '" + _sExpected + "'");
		}
	}
	
	/**
	 * 
	 */
	public String toString() {
		return pInfinitive;
	}
	
	/**
	 * 
	 */
	public final String displayVerb() {
		return pInfinitive + ", " + pPreterit + ", " + pParticipe;
	}
	
	
	
	/*
	 * Getters & Setters
	 */
	public final String getpInfinitive() {
		return pInfinitive;
	}
	public final IVVerbManager getpIVVerbManager() {
		return pIVVerbManager;
	}
	public final String getpPreterit() {
		return pPreterit;
	}
	public final String getpParticipe() {
		return pParticipe;
	}
	public final void setpPreterit(String _sPPreterit) {
		pPreterit = _sPPreterit;
	}
	public final void setpParticipe(String _sPParticipe) {
		pParticipe = _sPParticipe;
	}
	public final IVEval getpIVEval() {
		return pIVEval;
	}
	
}
