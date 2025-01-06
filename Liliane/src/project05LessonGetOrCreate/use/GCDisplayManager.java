package project05LessonGetOrCreate.use;

import project05LessonGetOrCreate.GCManager;
import project05LessonGetOrCreate.objects.mark.GCMark;
import project05LessonGetOrCreate.objects.student.GCStudent;
import project05LessonGetOrCreate.objects.subject.GCSubject;

public class GCDisplayManager {

	public GCDisplayManager(GCManager _sGCManager) {
		pGCManager = _sGCManager;
	}
	
	/*
	 * Data
	 */
	private GCManager pGCManager;
	
	/**
	 * 
	 */
	public final void run() {
		/*
		 * Display students
		 */
		for (GCStudent lGCStudent : pGCManager.getpGCStudentManager().getpMapNameToGCStudent().values()) {
			System.out.println("Les notes de l'etudiant " + lGCStudent.getpName() + " sont:");
			for (GCSubject lGCSubject : lGCStudent.getpMapGCSubjectToGCMark().keySet()) {
				GCMark lGCMark = lGCStudent.getpMapGCSubjectToGCMark().get(lGCSubject);
				System.out.println("   " + lGCMark.toString() + " (moyenne de la classe= " + lGCSubject.getpGCMark().getpMarkOutOf20() + "/20)");
			}
			System.out.println(lGCStudent.getpGCMarkTotal().toString());
			System.out.println();
		}
		/*
		 * Display subject
		 */
		for (GCSubject lGCSubject : pGCManager.getpGCSubjectManager().getpMapNameToGCSubject().values()) {
			System.out.println(lGCSubject.getpGCMark().toString());
		}
		System.out.println();
		/*
		 * Display class
		 */
		System.out.println(pGCManager.getpGCComputeManager().getpGCMarkClass());
	}
	
}
