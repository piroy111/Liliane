package project03ChiffresRomains.testor;

import basicmethods.BasicPrintMsg;
import basicmethods.BasicTime;
import project03ChiffresRomains.CRManager;

public class Testor {

	public Testor(CRManager _sCRManager) {
		pCRManager = _sCRManager;
	}
	
	/*
	 * Data
	 */
	private CRManager pCRManager;
	
	/**
	 * 
	 */
	public final void run() {
		/*
		 * Integer -> Roman
		 */
		BasicPrintMsg.displayTitle(this, "Test conversion Integer --> Roman");
		for (int lIdx = 0; lIdx < 10; lIdx++) {
			int lNumber = (int) (Math.random() * 5000);
			System.out.println(lNumber + " --> " + pCRManager.getpComputorIntegerToRoman().getRomanNumber(lNumber));
		}
		/*
		 * Roman to Integer
		 */
		BasicPrintMsg.displayTitle(this, "Test conversion Roman --> Integer");
		String lRomanTest = "MMMMDCXLVIII";
		System.out.println(lRomanTest + " --> " + pCRManager.getpComputorRomanToInteger().getpInteger(lRomanTest));
		/*
		 * Consistency
		 */
		BasicPrintMsg.displayTitle(this, "Test conversion Roman <--> Integer");
		for (int lIdx = 0; lIdx < 10; lIdx++) {
			int lNumber = (int) (Math.random() * 5000);
			String lRoman = pCRManager.getpComputorIntegerToRoman().getRomanNumber(lNumber);
			int lNumberBack = pCRManager.getpComputorRomanToInteger().getpInteger(lRoman);
			if (lNumber == lNumberBack) {
				System.out.println(lNumber + " <--> " + lRoman);
			} else {
				BasicTime.sleep(50);
				System.err.println(lNumber + " --> " + lRoman + " --> " + lNumberBack);
				BasicTime.sleep(50);
			}
		}
	}
	
}
