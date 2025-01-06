package project07ExerciseBaseNumber.objects.base;

import java.util.ArrayList;
import java.util.List;

import project07ExerciseBaseNumber.objects.numberinbase.BNNumberInBase;

public class BNBase {

	protected BNBase(List<String> _sListChar, BNBaseManager _sBNBaseManager) {
		pListChar = new ArrayList<>(_sListChar);
		pBNBaseManager = _sBNBaseManager;
	}
	
	/*
	 * Data
	 */
	private List<String> pListChar;
	private BNBaseManager pBNBaseManager;
	private List<BNNumberInBase> pListBNNumberInBase;
	
	/**
	 * 
	 */
	protected final void computeListBNNumberInBase() {
		/*
		 * Initiate the first BNNumberInBase
		 */
		BNNumberInBase lBNNumberInBase = pBNBaseManager.getpBNManager().getpBNNumberInBaseManager().getpBNNumberInBaseZero(this);
		/*
		 * Compute each new number and add them to the list
		 */
		pListBNNumberInBase = new ArrayList<>();
		for (int lValue = 1; lValue < 20; lValue++) {
			pListBNNumberInBase.add(lBNNumberInBase);
			List<Integer> lListIdx = lBNNumberInBase.getpListIdxNextNumber();
			lBNNumberInBase = new BNNumberInBase(this, lValue);
			/*
			 * Compute and fill the BNNumberInBase
			 */
			lBNNumberInBase.setpFromListIdxInBNBase(lListIdx);
		}
	}

	/**
	 * 
	 */
	public String toString() {
		return pListChar.toString();
	}

	/*
	 * Getters & Setters
	 */
	public final List<String> getpListChar() {
		return pListChar;
	}
	public final BNBaseManager getpBNBaseManager() {
		return pBNBaseManager;
	}
	public final List<BNNumberInBase> getpListBNNumberInBase() {
		return pListBNNumberInBase;
	}
	
}
