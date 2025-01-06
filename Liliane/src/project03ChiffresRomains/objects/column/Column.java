package project03ChiffresRomains.objects.column;

import basicmethods.BasicPrintMsg;
import project03ChiffresRomains.objects.rawnumbers.RawNumber;

public class Column implements Comparable<Column> {

	public Column(RawNumber _sFirst, RawNumber _sMiddle, RawNumber _sLast, ColumnManager _sColumnManager) {
		pFirst = _sFirst;
		pMiddle = _sMiddle;
		pLast = _sLast;
		pColumnManager = _sColumnManager;
		/*
		 * Check viability of middle
		 */
		if (pMiddle.getpValue() != (pLast.getpValue() / 2)) {
			BasicPrintMsg.errorCodeLogic();
		}
		pKey = getKey(pFirst, pMiddle, pLast);
	}
	
	/*
	 * Data
	 */
	private ColumnManager pColumnManager;
	private RawNumber pFirst;
	private RawNumber pMiddle;
	private RawNumber pLast;
	private String pKey;
	
	@Override public int compareTo(Column _sColumn) {
		return Integer.compare(pFirst.getpValue(), _sColumn.pFirst.getpValue());
	}

	/**
	 * 
	 * @param _sFirst
	 * @param _sMiddle
	 * @param _sLast
	 * @return
	 */
	public static String getKey(RawNumber _sFirst, RawNumber _sMiddle, RawNumber _sLast) {
		return _sFirst + "; " + _sMiddle + "; " + _sLast;
	}
	
	/**
	 * Classic toString
	 */
	public String toString() {
		return pFirst + "; " + pMiddle + "; " + pLast;
	}

	/*
	 * Getters & Setters
	 */
	public final ColumnManager getpColumnManager() {
		return pColumnManager;
	}
	public final RawNumber getpFirst() {
		return pFirst;
	}
	public final RawNumber getpMiddle() {
		return pMiddle;
	}
	public final RawNumber getpLast() {
		return pLast;
	}
	public final String getpKey() {
		return pKey;
	}
	
	
}
