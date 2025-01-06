package project03ChiffresRomains.computor;

import project03ChiffresRomains.CRManager;
import project03ChiffresRomains.objects.rawnumbers.RawNumber;

public class ComputorRomanToInteger {

	public ComputorRomanToInteger(CRManager _sCRManager) {
		pCRManager = _sCRManager;
	}
	
	/*
	 * Data
	 */
	private CRManager pCRManager;
	
	/**
	 * Read each letter: if a letter is followed by a bigger one, we need to subtract ortherwise we need to add
	 * @param _sRoman
	 * @return
	 */
	public int getpInteger(String _sRoman) {
		int lInteger = 0;
		/*
		 * Read each letter: if a letter is followed by a bigger one, we need to subtract otherwise we need to add
		 */
		for (int lIdx = 0; lIdx < _sRoman.length(); lIdx++) {
			String lLetter = "" + _sRoman.charAt(lIdx);
			RawNumber lRawNumber = pCRManager.getpRawNumberManager().getpMapLetterToRawNumber().get(lLetter);
			/*
			 * Case there is a letter which follows
			 */
			if (lIdx < _sRoman.length() - 1) {
				String lLetterNext = "" + _sRoman.charAt(lIdx + 1);
				RawNumber lRawNumberNext = pCRManager.getpRawNumberManager().getpMapLetterToRawNumber().get(lLetterNext);
				/*
				 * Case the next letter is bigger --> we subtract
				 */
				if (lRawNumber.compareTo(lRawNumberNext) < 0) {
					lInteger += -lRawNumber.getpValue();
				}
				/*
				 * Case the next letter is smaller --> we add
				 */
				else {
					lInteger += lRawNumber.getpValue();
				}
			}
			/*
			 * Case this is the last letter --> we add
			 */
			else {
				lInteger += lRawNumber.getpValue();
			}
		}
		return lInteger;
	}
	
}
