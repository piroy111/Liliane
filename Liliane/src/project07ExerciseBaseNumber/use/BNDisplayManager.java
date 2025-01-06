package project07ExerciseBaseNumber.use;

import project07ExerciseBaseNumber.BNManager;
import project07ExerciseBaseNumber.objects.base.BNBase;
import project07ExerciseBaseNumber.objects.numberinbase.BNNumberInBase;

public class BNDisplayManager {
	
	public BNDisplayManager(BNManager _sBNManager) {
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
		for (BNBase lBNBase : pBNManager.getpBNBaseManager().getpListBNBase()) {
			System.out.println(">> BNBase= " + lBNBase);
			for (BNNumberInBase lBNNumberInBase : lBNBase.getpListBNNumberInBase()) {
				System.out.println("  " + lBNNumberInBase);
			}
			System.out.println();
		}
	}

	/*
	 * Getters & Setters
	 */
	public final BNManager getpBNManager() {
		return pBNManager;
	}
	
}
