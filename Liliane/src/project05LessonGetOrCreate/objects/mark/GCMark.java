package project05LessonGetOrCreate.objects.mark;

public class GCMark {

	protected GCMark(double _sValue, int _sValueMax, String _sTitle) {
		pValue = _sValue;
		pValueMax = _sValueMax;
		pTitle = _sTitle;
		/*
		 * 
		 */
		pMarkOutOf20 = pValue / pValueMax * 20;
	}
	
	/*
	 * Data
	 */
	private double pValue;
	private int pValueMax;
	private String pTitle;
	private double pMarkOutOf20;
	
	/**
	 * Classic to String
	 */
	public final String toString() {
		return pTitle + "= " + pValue + "/" + pValueMax + " -- > " + pMarkOutOf20 + "/20"; 
	}
	
	/**
	 * 
	 * @param _sGCMark
	 */
	public final void add(GCMark _sGCMark) {
		pValue += _sGCMark.getpValue();
		pValueMax += _sGCMark.getpValueMax();
		pMarkOutOf20 = pValue / pValueMax * 20.;
	}
	
	/*
	 * Getters & Setters
	 */
	public final double getpValue() {
		return pValue;
	}
	public final int getpValueMax() {
		return pValueMax;
	}
	public final String getpTitle() {
		return pTitle;
	}
	public final double getpMarkOutOf20() {
		return pMarkOutOf20;
	}
}
