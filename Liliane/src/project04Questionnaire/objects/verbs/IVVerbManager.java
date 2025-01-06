package project04Questionnaire.objects.verbs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import project04Questionnaire.IVManager;

public class IVVerbManager {

	public IVVerbManager(IVManager _sIVManager) {
		pIVManager = _sIVManager;
		/*
		 * 
		 */
		pMapInfinitiveToIVVerb = new HashMap<>();
		pListIVVerb = new ArrayList<>();
	}
	
	/*
	 * Data
	 */
	private IVManager pIVManager;
	private Map<String, IVVerb> pMapInfinitiveToIVVerb;
	private List<IVVerb> pListIVVerb;
	
	/**
	 * 
	 */
	public final void run() {
		getpOrCreateIVVerb("to run").declareNewData("I ran", "run");
		getpOrCreateIVVerb("to see").declareNewData("I saw", "seen");
		getpOrCreateIVVerb("to sleep").declareNewData("I slept", "slept");
	}
	
	/**
	 * 
	 * @param _sInfinitive
	 * @return
	 */
	public final IVVerb getpOrCreateIVVerb(String _sInfinitive) {
		IVVerb lIVVerb = pMapInfinitiveToIVVerb.get(_sInfinitive);
		if (lIVVerb == null) {
			lIVVerb = new IVVerb(_sInfinitive, this);
			pMapInfinitiveToIVVerb.put(_sInfinitive, lIVVerb);
			pListIVVerb.add(lIVVerb);
		}
		return lIVVerb;
	}
	
	/*
	 * Getters & Setters
	 */
	public final IVManager getpIVManager() {
		return pIVManager;
	}
	public final Map<String, IVVerb> getpMapInfinitiveToIVVerb() {
		return pMapInfinitiveToIVVerb;
	}

	public final List<IVVerb> getpListIVVerb() {
		return pListIVVerb;
	}
	
	
	
	
	
}
