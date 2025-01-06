package project05LessonGetOrCreate.use;

import project05LessonGetOrCreate.GCManager;
import project05LessonGetOrCreate.objects.mark.GCMark;
import project05LessonGetOrCreate.objects.student.GCStudent;

public class GCComputeManager {

	public GCComputeManager(GCManager _sGCManager) {
		pGCManager = _sGCManager;
	}
	
	/*
	 * Data
	 */
	private GCManager pGCManager;
	private GCMark pGCMarkClass;

	
	/**
	 * 
	 */
	public final void run() {
		pGCMarkClass = pGCManager.getpGCMarkManager().createGCMarkEmpty("Total Mark of the Class");
		for (GCStudent lGCStudent : pGCManager.getpGCStudentManager().getpMapNameToGCStudent().values()) {
			pGCMarkClass.add(lGCStudent.getpGCMarkTotal());
		}
	}

	/*
	 * Getters & Setters
	 */
	public final GCManager getpGCManager() {
		return pGCManager;
	}
	public final GCMark getpGCMarkClass() {
		return pGCMarkClass;
	}
	
}
