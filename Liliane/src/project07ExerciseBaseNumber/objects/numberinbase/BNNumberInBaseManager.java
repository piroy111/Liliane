package project07ExerciseBaseNumber.objects.numberinbase;

import java.util.ArrayList;
import java.util.List;

import project07ExerciseBaseNumber.BNManager;
import project07ExerciseBaseNumber.objects.base.BNBase;

public class BNNumberInBaseManager {

	public BNNumberInBaseManager(BNManager _sBNManager) {
		pBNManager = _sBNManager;
	}
	
	/*
	 * Data
	 */
	private BNManager pBNManager;

	/**
	 * 
	 */
	public final void run() {
		
	}
	
	/**
	 * 
	 * @param _sBNBase
	 * @return
	 */
	public final BNNumberInBase getpBNNumberInBaseZero(BNBase _sBNBase) {
		BNNumberInBase lBNNumberInBase = new BNNumberInBase(_sBNBase, 0);
		List<Integer> lListIdx = new ArrayList<>();
		lListIdx.add(0);
		lBNNumberInBase.setpFromListIdxInBNBase(lListIdx);
		return lBNNumberInBase;
	}
	
	/*
	 * Getters & Setters
	 */
	public final BNManager getpBNManager() {
		return pBNManager;
	}
	
}
