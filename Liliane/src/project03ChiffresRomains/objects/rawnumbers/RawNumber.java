package project03ChiffresRomains.objects.rawnumbers;

public class RawNumber implements Comparable<RawNumber> {

	public RawNumber(String _sLetter, int _sValue, RawNumberManager _sRawNumberManager) {
		pLetter = _sLetter;
		pValue = _sValue;
		pRawNumberManager = _sRawNumberManager;
	}

	/*
	 * Data
	 */
	private RawNumberManager pRawNumberManager;
	private String pLetter;
	private int pValue;
	
	/**
	 * 
	 */
	@Override public int compareTo(RawNumber _sRawNumber) {
		return Integer.compare(pValue, _sRawNumber.pValue);
	}
	
	/**
	 * Classic toString
	 */
	public String toString() {
		return pLetter + "= " + pValue;
	}
	
	/*
	 * Getters & Setters
	 */
	public final String getpLetter() {
		return pLetter;
	}
	public final int getpValue() {
		return pValue;
	}
	public final RawNumberManager getpRawNumberManager() {
		return pRawNumberManager;
	}
	
	
}
