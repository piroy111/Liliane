package project06ExerciceChess.objects.move;

import project06ExerciceChess.CHManager;

public class CHMoveManager {

	public CHMoveManager(CHManager _sCHManager) {
		pCHManager = _sCHManager;
	}
	
	/*
	 * Data
	 */
	private CHManager pCHManager;

	/**
	 * 
	 */
	public final CHMove createCHMove(String _sWayOfMoving, int _sNbSquareMax) {
		return new CHMove(_sWayOfMoving, _sNbSquareMax);
	}

	/*
	 * Getters & Setters
	 */
	public final CHManager getpCHManager() {
		return pCHManager;
	}
	
	
}
