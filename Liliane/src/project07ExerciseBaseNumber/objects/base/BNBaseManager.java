package project07ExerciseBaseNumber.objects.base;

import java.util.ArrayList;
import java.util.List;

import project07ExerciseBaseNumber.BNManager;

public class BNBaseManager {

	public BNBaseManager(BNManager _sBNManager) {
		pBNManager = _sBNManager;
	}
	
	/*
	 * Data
	 */
	private BNManager pBNManager;
	private List<BNBase> pListBNBase;

	/**
	 * 
	 */
	public final void run() {
		pListBNBase = new ArrayList<>();
		List<String> lListChar = new ArrayList<>();
		lListChar.add("0");
		/*
		 * 
		 */
		for (int lIdx = 1; lIdx < 10; lIdx++) {
			lListChar.add("" + lIdx);
			BNBase lBNBase = new BNBase(lListChar, this);
			lBNBase.computeListBNNumberInBase();
			pListBNBase.add(lBNBase);
		}
		/*
		 * Add bases hexadecimal
		 */
		for (char lChar = 'A'; lChar <= 'F'; lChar++) {
			lListChar.add("" + lChar);
			BNBase lBNBase = new BNBase(lListChar, this);
			lBNBase.computeListBNNumberInBase();
			pListBNBase.add(lBNBase);
		}
	}
	
	/*
	 * Getters & Setters
	 */
	public final BNManager getpBNManager() {
		return pBNManager;
	}

	public final List<BNBase> getpListBNBase() {
		return pListBNBase;
	}
	
}
