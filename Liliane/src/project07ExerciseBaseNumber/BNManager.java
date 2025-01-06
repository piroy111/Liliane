package project07ExerciseBaseNumber;

import project07ExerciseBaseNumber.objects.base.BNBaseManager;
import project07ExerciseBaseNumber.objects.numberinbase.BNNumberInBaseManager;
import project07ExerciseBaseNumber.use.BNComputeManager;
import project07ExerciseBaseNumber.use.BNDisplayManager;

public class BNManager {

	
	public BNManager() {
		pBNDisplayManager = new BNDisplayManager(this);
		pBNComputeManager = new BNComputeManager(this);
		pBNBaseManager = new BNBaseManager(this);
		pBNNumberInBaseManager = new BNNumberInBaseManager(this);
		pBNBaseManager = new BNBaseManager(this);
	}
	
	/*
	 * Data
	 */
	private BNDisplayManager pBNDisplayManager;
	private BNComputeManager pBNComputeManager;
	private BNBaseManager pBNBaseManager;
	private BNNumberInBaseManager pBNNumberInBaseManager;
	
	/**
	 * 
	 */
	public final void run() {
		pBNBaseManager.run();
		pBNNumberInBaseManager.run();
		pBNComputeManager.run();
		pBNDisplayManager.run();
	}
	
	/*
	 * Getters & Setters
	 */
	public final BNDisplayManager getpBNDisplayManager() {
		return pBNDisplayManager;
	}
	public final BNComputeManager getpBNComputeManager() {
		return pBNComputeManager;
	}
	public final BNBaseManager getpBNBaseManager() {
		return pBNBaseManager;
	}
	public final BNNumberInBaseManager getpBNNumberInBaseManager() {
		return pBNNumberInBaseManager;
	}
	
	
}
