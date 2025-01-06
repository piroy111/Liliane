package project04Questionnaire;

import project04Questionnaire.objects.eval.IVEvalManager;
import project04Questionnaire.objects.verbs.IVVerbManager;
import project04Questionnaire.use.IVDisplayManager;
import project04Questionnaire.use.IVQuestionnaire;

public class IVManager {

	public IVManager() {
		pIVEvalManager = new IVEvalManager(this);
		pIVVerbManager = new IVVerbManager(this);
		pIVDisplayManager = new IVDisplayManager(this);
		pIVQuestionnaire = new IVQuestionnaire(this);
	}
	
	/*
	 * Data
	 */
	private IVEvalManager pIVEvalManager;
	private IVVerbManager pIVVerbManager;
	private IVDisplayManager pIVDisplayManager;
	private IVQuestionnaire pIVQuestionnaire;

	/**
	 * 
	 */
	public final void run() {
		pIVVerbManager.run();
		pIVQuestionnaire.run();
		pIVDisplayManager.run();
	}
	
	/*
	 * Getters & Setters
	 */
	public final IVEvalManager getpIVEvalManager() {
		return pIVEvalManager;
	}
	public final IVVerbManager getpIVVerbManager() {
		return pIVVerbManager;
	}
	public final IVQuestionnaire getpIVQuestionnaire() {
		return pIVQuestionnaire;
	}
}
