package project06ExerciceChess;

import project06ExerciceChess.actions.CHDisplayManager;
import project06ExerciceChess.objects.move.CHMoveManager;
import project06ExerciceChess.objects.piece.CHPieceManager;

public class CHManager {

	public CHManager() {
		pCHPieceManager = new CHPieceManager(this);
		pCHMoveManager = new CHMoveManager(this);
		pCHDisplayManager = new CHDisplayManager(this);
	}
	
	/*
	 * Data
	 */
	private CHPieceManager pCHPieceManager;
	private CHMoveManager pCHMoveManager;
	private CHDisplayManager pCHDisplayManager;
	
	/**
	 * 
	 */
	public final void run() {
		pCHPieceManager.run();
		pCHDisplayManager.run();
	}

	/*
	 * Getters & Setters
	 */
	public final CHPieceManager getpCHPieceManager() {
		return pCHPieceManager;
	}
	public final CHMoveManager getpCHMoveManager() {
		return pCHMoveManager;
	}
	
}
