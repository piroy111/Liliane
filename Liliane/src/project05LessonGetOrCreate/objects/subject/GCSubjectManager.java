package project05LessonGetOrCreate.objects.subject;

import java.util.HashMap;
import java.util.Map;

import basicmethods.BasicPrintMsg;
import project05LessonGetOrCreate.GCManager;

public class GCSubjectManager {

	public GCSubjectManager(GCManager _sGCManager) {
		pGCManager = _sGCManager;
		/*
		 * 
		 */
		pMapNameToGCSubject = new HashMap<>();
	}
	
	/*
	 * Data
	 */
	private GCManager pGCManager;
	private Map<String, GCSubject> pMapNameToGCSubject;
	
	/**
	 * instantiate and initiate the objects
	 */
	public final void run() {
		getpOrCreateGCSubject("Francais").setpValueMax(100);
		getpOrCreateGCSubject("Mathematiques").setpValueMax(100);
		getpOrCreateGCSubject("Oral").setpValueMax(100);
		getpOrCreateGCSubject("Sciences").setpValueMax(50);
		getpOrCreateGCSubject("Histoire-Geo + EMC").setpValueMax(50);
	}

	/**
	 * Classic get or create
	 * @param _sName
	 * @return
	 */
	public final GCSubject getpOrCreateGCSubject(String _sName) {
		GCSubject lGCSubject = pMapNameToGCSubject.get(_sName);
		if (lGCSubject == null) {
			lGCSubject = new GCSubject(_sName, this);
			pMapNameToGCSubject.put(_sName, lGCSubject);
		}
		return lGCSubject;
	}
	
	/**
	 * 
	 * @param _sName
	 * @return
	 */
	public final GCSubject getpAnCheckGCSubject(String _sName) {
		GCSubject lGCSubject = pMapNameToGCSubject.get(_sName);
		if (lGCSubject == null) {
			BasicPrintMsg.error("Unknown GCSubject= '" + _sName + "'");
		}
		return lGCSubject;
	}
	
	/*
	 * Getters & Setters
	 */
	public final GCManager getpGCManager() {
		return pGCManager;
	}
	public final Map<String, GCSubject> getpMapNameToGCSubject() {
		return pMapNameToGCSubject;
	}
}
