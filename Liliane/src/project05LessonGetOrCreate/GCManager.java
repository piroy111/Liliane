package project05LessonGetOrCreate;

import project05LessonGetOrCreate.objects.mark.GCMarkManager;
import project05LessonGetOrCreate.objects.student.GCStudentManager;
import project05LessonGetOrCreate.objects.subject.GCSubjectManager;
import project05LessonGetOrCreate.use.GCComputeManager;
import project05LessonGetOrCreate.use.GCDisplayManager;

public class GCManager {

	public GCManager() {
		pGCStudentManager = new GCStudentManager(this);
		pGCSubjectManager = new GCSubjectManager(this);
		pGCMarkSubjectManager = new GCMarkManager(this);
		pGCDisplayManager = new GCDisplayManager(this);
		pGCComputeManager = new GCComputeManager(this);
	}
	
	/*
	 * Data
	 */
	private GCStudentManager pGCStudentManager;
	private GCSubjectManager pGCSubjectManager;
	private GCMarkManager pGCMarkSubjectManager;
	private GCDisplayManager pGCDisplayManager;
	private GCComputeManager pGCComputeManager;
	
	/**
	 * 
	 */
	public final void run() {
		/*
		 * Instantiate and initiate
		 */
		pGCSubjectManager.run();
		pGCStudentManager.run();
		/*
		 * 
		 */
		pGCComputeManager.run();
		pGCDisplayManager.run();
	}

	/*
	 * Getters & Setters
	 */
	public final GCStudentManager getpGCStudentManager() {
		return pGCStudentManager;
	}
	public final GCSubjectManager getpGCSubjectManager() {
		return pGCSubjectManager;
	}
	public final GCMarkManager getpGCMarkManager() {
		return pGCMarkSubjectManager;
	}
	public final GCComputeManager getpGCComputeManager() {
		return pGCComputeManager;
	}
	
}
