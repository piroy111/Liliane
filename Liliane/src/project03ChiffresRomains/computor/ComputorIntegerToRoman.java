package project03ChiffresRomains.computor;

import basicmethods.BasicPrintMsg;
import project03ChiffresRomains.CRManager;
import project03ChiffresRomains.objects.column.Column;
import project03ChiffresRomains.objects.column.ColumnManager;
import project03ChiffresRomains.objects.rawnumbers.RawNumber;

public class ComputorIntegerToRoman {

	public ComputorIntegerToRoman(CRManager _sCRManager) {
		pCRManager = _sCRManager;
	}
	
	/*
	 * Data
	 */
	private CRManager pCRManager;
	
	/**
	 * 
	 */
	public final void testor() {
		BasicPrintMsg.displayTitle(this, "Test conversion into roman numbers");
//		int lTestNumber = 949; System.out.println(lTestNumber + " --> " + getRomanNumber(lTestNumber));
		for (int lIdx = 0; lIdx < 10; lIdx++) {
			int lNumber = (int) (Math.random() * 5000);
			System.out.println(lNumber + " --> " + getRomanNumber(lNumber));
		}
	}
	
	/**
	 * 
	 * @param _sNumber
	 * @return
	 */
	public final String getRomanNumber(int _sNumber) {
		/*
		 * Initiate
		 */
		ColumnManager lColumnManager = pCRManager.getpColumnManager();
		String lRomanNumber = "";
		int lNumber = _sNumber;
		/*
		 * Loop on the columns
		 */
		int lIdxColumn = lColumnManager.getpListColumn().size();
		while (--lIdxColumn >= 0 && lNumber > 0) {
			Column lColumn = lColumnManager.getpListColumn().get(lIdxColumn);
			/*
			 * Case that the number is above the last limit
			 */
			RawNumber lLast = lColumn.getpLast(); 
			while (lNumber > lLast.getpValue()) {
				lRomanNumber += lLast.getpLetter();
				lNumber = lNumber - lLast.getpValue();
			}
			/*
			 * Case the number is between the limits
			 */
			RawNumber lFirst = lColumn.getpFirst();
			int lNbFirst = lNumber / lFirst.getpValue();
			/*
			 * Case of subtraction
			 */
			if (lNbFirst == 9) {
				lRomanNumber += lFirst.getpLetter() + lLast.getpLetter();
			} else if (lNbFirst == 4) {
				lRomanNumber += lFirst.getpLetter() + lColumn.getpMiddle().getpLetter();
			} else {
				/*
				 * Case of the middle
				 */
				int lNbFirstToWrite = lNbFirst;
				if (lNbFirstToWrite >= 5) {
					lRomanNumber += lColumn.getpMiddle().getpLetter();
					lNbFirstToWrite = lNbFirstToWrite - 5;
				}
				/*
				 * Case we add the first
				 */
				for (int lIdx = 0; lIdx < lNbFirstToWrite; lIdx++) {
					lRomanNumber += lFirst.getpLetter();
				}				
			}
			/*
			 * Discount the value of what we have just written
			 */
			lNumber += -lNbFirst * lFirst.getpValue();
		}
		return lRomanNumber;
	}
	
}
