package project05LessonGetOrCreate.objects.mark;

import project05LessonGetOrCreate.GCManager;
import project05LessonGetOrCreate.objects.subject.GCSubject;

public class GCMarkManager {

	public GCMarkManager(GCManager _sGCManager) {
		pGCManager = _sGCManager;
	}
	
	/*
	 * Data
	 */
	private GCManager pGCManager;
	
	/**
	 * 
	 * @param _sTitle
	 * @return
	 */
	public GCMark createGCMarkEmpty(String _sTitle) {
		return createGCMarkSubject(_sTitle, 0, 0);
	}
	
	/**
	 * 
	 * @param _sTitle
	 * @param _sValue
	 * @param _sValueMax
	 * @return
	 */
	public GCMark createGCMarkSubject(String _sTitle, double _sValue, int _sValueMax) {
		return new GCMark(_sValue, _sValueMax, _sTitle);
	}
	
	/**
	 * 
	 * @param _sTitle
	 * @param _sValue
	 * @param _sValueMax
	 * @return
	 */
	public GCMark createGCMarkSubject(double _sValue, GCSubject _sGCSubject) {
		return new GCMark(_sValue, _sGCSubject.getpValueMax(), _sGCSubject.getpName());
	}
	
	/*
	 * Getters & Setters
	 */
	public final GCManager getpGCManager() {
		return pGCManager;
	}
}
