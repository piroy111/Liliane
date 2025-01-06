package project05LessonGetOrCreate.objects.subject;

import project05LessonGetOrCreate.objects.mark.GCMark;

public class GCSubject {

	protected GCSubject(String _sName, GCSubjectManager _sGCSubjectManager) {
		pName = _sName;
		pGCSubjectManager = _sGCSubjectManager;
		/*
		 * 
		 */
		pGCMark = pGCSubjectManager.getpGCManager().getpGCMarkManager().createGCMarkEmpty(pName);
	}
	
	/*
	 * Data
	 */
	private String pName;
	private GCSubjectManager pGCSubjectManager;
	private int pValueMax;
	private GCMark pGCMark;
	
	/**
	 * 
	 * @param _sGCMark
	 */
	public final void declareNewGCMark(GCMark _sGCMark) {
		pGCMark.add(_sGCMark);
	}
	
	/*
	 * Getters & Setters
	 */
	public final String getpName() {
		return pName;
	}
	public final GCSubjectManager getpGCSubjectManager() {
		return pGCSubjectManager;
	}
	public final int getpValueMax() {
		return pValueMax;
	}
	public final void setpValueMax(int _sPValueMax) {
		pValueMax = _sPValueMax;
	}

	public final GCMark getpGCMark() {
		return pGCMark;
	}
}
