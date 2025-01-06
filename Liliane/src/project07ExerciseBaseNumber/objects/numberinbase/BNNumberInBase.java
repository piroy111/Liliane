package project07ExerciseBaseNumber.objects.numberinbase;

import java.util.ArrayList;
import java.util.List;

import project07ExerciseBaseNumber.objects.base.BNBase;

public class BNNumberInBase {

	public BNNumberInBase(BNBase _sBNBase, int _sValue) {
		pBNBase = _sBNBase;
		pValue = _sValue;
	}

	/*
	 * Data
	 */
	private int pValue;
	private BNBase pBNBase;
	private List<Integer> pListIdxInBNBase;
	private List<String> pListCharInBNBase;
	private String pValueInBNBase;

	/**
	 * 
	 * @return
	 */
	public final List<Integer> getpListIdxNextNumber() {
		List<Integer> lListNextIdx = new ArrayList<>();
		int lIdxMax = pBNBase.getpListChar().size();
		int lDecal = 1;
		for (int lIdx : pListIdxInBNBase) {
			/*
			 * We get the next number for the row defined by the place in the list
			 */
			int lIdxNew = lIdx + lDecal;
			/*
			 * if the next number is valid, then we will copy all the following numbers as such (DECAL = 0)
			 */
			if (lIdxNew < lIdxMax) {
				lListNextIdx.add(lIdxNew);
				lDecal = 0;
			} 
			/*
			 * If the next number is outside of the list of char of the base, then we set it at zero
			 */
			else {
				lListNextIdx.add(0);
			}
		}
		if (lDecal == 1) {
			lListNextIdx.add(lDecal);
		}
		return lListNextIdx;
	}

	/**
	 * 
	 * @param _sPListIdxInBNBase
	 */
	public final void setpFromListIdxInBNBase(List<Integer> _sPListIdxInBNBase) {
		pListIdxInBNBase = new ArrayList<>(_sPListIdxInBNBase);
		pListCharInBNBase = new ArrayList<>();
		for (int lIdx : pListIdxInBNBase) {
			pListCharInBNBase.add(pBNBase.getpListChar().get(lIdx));
		}
		pValueInBNBase = "";
		for (int lIdx = pListCharInBNBase.size() - 1; lIdx >= 0; lIdx--) {
			pValueInBNBase += pListCharInBNBase.get(lIdx);
		}
	}

	/**
	 * 
	 */
	public String toString() {
		return "Value= " + pValue + " (base 10) or " + pValueInBNBase + " (base " + pBNBase.getpListChar().size() + ")";
	}

	/*
	 * Getters & Setters
	 */
	public final int getpValue() {
		return pValue;
	}
	public final BNBase getpBNBase() {
		return pBNBase;
	}
	public final List<Integer> getpListIdxInBNBase() {
		return pListIdxInBNBase;
	}
	public final List<String> getpListCharInBNBase() {
		return pListCharInBNBase;
	}
	public final String getpValueInBNBase() {
		return pValueInBNBase;
	}
	
}
