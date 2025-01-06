package project05LessonGetOrCreate.objects.student;

import java.util.HashMap;
import java.util.Map;

import project05LessonGetOrCreate.GCManager;

public class GCStudentManager {

	public GCStudentManager(GCManager _sGCManager) {
		pGCManager = _sGCManager;
		/*
		 * 
		 */
		pMapNameToGCStudent = new HashMap<>();
	}
	
	/*
	 * Data
	 */
	private GCManager pGCManager;
	private Map<String, GCStudent> pMapNameToGCStudent;
	
	/**
	 * instantiate and initiate the objects
	 */
	public final void run() {
		/*
		 * LILIANE
		 */
		getpOrCreateGCStudent("Liliane").declareNewMark("Francais", 62.5);
		getpOrCreateGCStudent("Liliane").declareNewMark("Mathematiques", 98);
		getpOrCreateGCStudent("Liliane").declareNewMark("Oral", 100);
		getpOrCreateGCStudent("Liliane").declareNewMark("Sciences", 34.5);
		getpOrCreateGCStudent("Liliane").declareNewMark("Histoire-Geo + EMC", 32.5);
		/*
		 * HUGO
		 */
		getpOrCreateGCStudent("Hugo").declareNewMark("Francais", 61);
		getpOrCreateGCStudent("Hugo").declareNewMark("Mathematiques", 91);
		getpOrCreateGCStudent("Hugo").declareNewMark("Oral", 90);
		getpOrCreateGCStudent("Hugo").declareNewMark("Sciences", 30);
		getpOrCreateGCStudent("Hugo").declareNewMark("Histoire-Geo + EMC", 26);
		/*
		 * LENA
		 */
		getpOrCreateGCStudent("Lena").declareNewMark("Francais", 80);
		getpOrCreateGCStudent("Lena").declareNewMark("Mathematiques", 99);
		getpOrCreateGCStudent("Lena").declareNewMark("Oral", 100);
		getpOrCreateGCStudent("Lena").declareNewMark("Sciences", 46);
		getpOrCreateGCStudent("Lena").declareNewMark("Histoire-Geo + EMC", 48);
	}

	/**
	 * Classic get or create
	 * @param _sName
	 * @return
	 */
	public final GCStudent getpOrCreateGCStudent(String _sName) {
		GCStudent lGCStudent = pMapNameToGCStudent.get(_sName);
		if (lGCStudent == null) {
			lGCStudent = new GCStudent(_sName, this);
			pMapNameToGCStudent.put(_sName, lGCStudent);
		}
		return lGCStudent;
	}
	
	/*
	 * Getters & Setters
	 */
	public final GCManager getpGCManager() {
		return pGCManager;
	}
	public final Map<String, GCStudent> getpMapNameToGCStudent() {
		return pMapNameToGCStudent;
	}
	public final void setpMapNameToGCStudent(Map<String, GCStudent> _sPMapNameToGCStudent) {
		pMapNameToGCStudent = _sPMapNameToGCStudent;
	}
}
