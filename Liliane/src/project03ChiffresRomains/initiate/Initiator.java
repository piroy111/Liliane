package project03ChiffresRomains.initiate;

import basicmethods.BasicPrintMsg;
import project03ChiffresRomains.CRManager;
import project03ChiffresRomains.objects.column.ColumnManager;
import project03ChiffresRomains.objects.rawnumbers.RawNumber;
import project03ChiffresRomains.objects.rawnumbers.RawNumberManager;

public class Initiator {

	public Initiator(CRManager _sCRManager) {
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
		BasicPrintMsg.displayTitle(this, "Initiate raw numbers");
		/*
		 * Create raw numbers
		 */
		RawNumberManager lRawNumberManager = pCRManager.getpRawNumberManager();
		lRawNumberManager.getpOrCreateRawNumber("I", 1);
		lRawNumberManager.getpOrCreateRawNumber("V", 5);
		lRawNumberManager.getpOrCreateRawNumber("X", 10);
		lRawNumberManager.getpOrCreateRawNumber("L", 50);
		lRawNumberManager.getpOrCreateRawNumber("C", 100);
		lRawNumberManager.getpOrCreateRawNumber("D", 500);
		lRawNumberManager.getpOrCreateRawNumber("M", 1000);
		lRawNumberManager.sortList();
		/*
		 * Create columns
		 */
		BasicPrintMsg.displayTitle(this, "Initiate columns");
		ColumnManager lColumnManager = pCRManager.getpColumnManager();
		int lSize = lRawNumberManager.getpListRawNumber().size();
		for (int lIdx = 0; lIdx < lSize - 1; lIdx += 2) {
			/*
			 * Read and load
			 */
			RawNumber lFirst = lRawNumberManager.getpListRawNumber().get(lIdx);
			RawNumber lMiddle = lIdx + 1 >= lSize ? null : lRawNumberManager.getpListRawNumber().get(lIdx + 1);
			RawNumber lLast = lIdx + 2 >= lSize ? null : lRawNumberManager.getpListRawNumber().get(lIdx + 2);
			/*
			 * Create
			 */
			lColumnManager.getpOrCreateColumn(lFirst, lMiddle, lLast);
		}
		lColumnManager.sortList();
	}
	
}
