package project04Questionnaire.objects.eval;

public class IVEval {

	protected IVEval(String _sKey) {
		pKey = _sKey;
		/*
		 * 
		 */
		pValue = 0;
		pValueMax = 0;
		pValueOutOfTwenty = 0.;
	}
	
	/*
	 * Data
	 */
	private String pKey;
	private int pValue;
	private int pValueMax;
	private double pValueOutOfTwenty;
	
	/**
	 * 
	 * @param _sValue
	 */
	public final void addNewValue(int _sValue) {
		pValue += _sValue;
		pValueMax++;
		pValueOutOfTwenty = pValue * 20. / pValueMax;
	}	

	/**
	 * 
	 * @param _sIVMark
	 */
	public final void addIVMark(IVEval _sIVMark) {
		pValue += _sIVMark.getpValue();
		pValueMax += _sIVMark.getpValueMax();
		pValueOutOfTwenty = pValue * 20. / pValueMax;
	}
	
	/**
	 * Classic toString
	 */
	public String toString() {
		return pValueOutOfTwenty + "/20";
	}
	
	/*
	 * Getters & Setters
	 */
	public final String getpKey() {
		return pKey;
	}
	public final int getpValue() {
		return pValue;
	}
	public final int getpValueMax() {
		return pValueMax;
	}
	public final double getpValueOutOfTwenty() {
		return pValueOutOfTwenty;
	}
	
}
