package project03ChiffresRomains.objects.rawnumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import basicmethods.BasicPrintMsg;
import project03ChiffresRomains.CRManager;

public class RawNumberManager {

	public RawNumberManager(CRManager _sCRManager) {
		pCRManager = _sCRManager;
		/*
		 * 
		 */
		pListRawNumber = new ArrayList<>();
		pTreeMapValueToRawNumber = new TreeMap<>();
		pMapLetterToRawNumber = new HashMap<>();
	}
	
	/*
	 * Data
	 */
	private CRManager pCRManager;
	private List<RawNumber> pListRawNumber;
	private TreeMap<Integer, RawNumber> pTreeMapValueToRawNumber;
	private Map<String, RawNumber> pMapLetterToRawNumber;
	
	/**
	 * classic get or create
	 * @param _sName
	 * @param _sValue
	 */
	public final RawNumber getpOrCreateRawNumber(String _sName, int _sValue) {
		RawNumber lRawNumber = pTreeMapValueToRawNumber.get(_sValue);
		if (lRawNumber == null) {
			lRawNumber = new RawNumber(_sName, _sValue, this);
			pTreeMapValueToRawNumber.put(_sValue, lRawNumber);
			pListRawNumber.add(lRawNumber);
			pMapLetterToRawNumber.put(_sName, lRawNumber);
			/*
			 * Communication
			 */
			BasicPrintMsg.display(this, "New RawNumber created: " + _sName + "= " + _sValue);
		} 
		/*
		 * Case of error if the raw number exists already but with a different letter
		 */
		else if (lRawNumber.getpLetter() != _sName) {
			BasicPrintMsg.error("The letter is different for the same value"
					+ "; Value= " + _sValue + "; Letter1= " + _sName + "; Letter2= " + lRawNumber.getpLetter());
		}
		/*
		 * 
		 */
		return lRawNumber;
	}

	/**
	 * 
	 */
	public final void sortList() {
		Collections.sort(pListRawNumber);
	}
	
	/*
	 * Getters & Setters
	 */
	public final CRManager getpCRManager() {
		return pCRManager;
	}
	public final List<RawNumber> getpListRawNumber() {
		return pListRawNumber;
	}
	public final TreeMap<Integer, RawNumber> getpTreeMapValueToRawNumber() {
		return pTreeMapValueToRawNumber;
	}
	public final Map<String, RawNumber> getpMapLetterToRawNumber() {
		return pMapLetterToRawNumber;
	}
	
	
	
	
	
}
