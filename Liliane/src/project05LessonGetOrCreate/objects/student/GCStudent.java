package project05LessonGetOrCreate.objects.student;

import java.util.HashMap;
import java.util.Map;

import project05LessonGetOrCreate.objects.mark.GCMark;
import project05LessonGetOrCreate.objects.subject.GCSubject;

public class GCStudent {

	protected GCStudent(String _sName, GCStudentManager _sGCStudentManager) {
		pName = _sName;
		pGCStudentManager = _sGCStudentManager;
		/*
		 * 
		 */
		pMapGCSubjectToGCMark = new HashMap<>();
		pGCMarkTotal = pGCStudentManager.getpGCManager().getpGCMarkManager().createGCMarkEmpty("Total");
	}
	
	/*
	 * Data
	 */
	private String pName;
	private GCStudentManager pGCStudentManager;
	private Map<GCSubject, GCMark> pMapGCSubjectToGCMark;
	private GCMark pGCMarkTotal;
	
	/**
	 * 
	 * @param _sGCSubject
	 * @param _sGCMark
	 */
	public final void declareNewMark(String _sNameSubject, double _sValue) {
		/*
		 * Create Mark
		 */
		GCSubject lGCSubject = pGCStudentManager.getpGCManager().getpGCSubjectManager().getpAnCheckGCSubject(_sNameSubject);
		GCMark lGCMark = pGCStudentManager.getpGCManager().getpGCMarkManager().createGCMarkSubject(_sValue, lGCSubject);
		pMapGCSubjectToGCMark.put(lGCSubject, lGCMark);
		/*
		 * Declare to upper subject
		 */
		lGCSubject.declareNewGCMark(lGCMark);
		/*
		 * Add to average
		 */
		pGCMarkTotal.add(lGCMark);
	}

	/*
	 * Getters & Setters
	 */
	public final String getpName() {
		return pName;
	}
	public final GCStudentManager getpGCStudentManager() {
		return pGCStudentManager;
	}
	public final Map<GCSubject, GCMark> getpMapGCSubjectToGCMark() {
		return pMapGCSubjectToGCMark;
	}

	public final GCMark getpGCMarkTotal() {
		return pGCMarkTotal;
	}
}
