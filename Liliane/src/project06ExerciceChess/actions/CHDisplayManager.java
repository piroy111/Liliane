package project06ExerciceChess.actions;

import project06ExerciceChess.CHManager;
import project06ExerciceChess.objects.piece.CHPiece;

public class CHDisplayManager {

	public CHDisplayManager(CHManager _sCHManager) {
		pCHManager = _sCHManager;
	}
	
	/*
	 * Data
	 */
	private CHManager pCHManager;
	
	/**
	 * 
	 */
	public final void run() {
		for (CHPiece lCHPiece : pCHManager.getpCHPieceManager().getpListCHPiece()) {
			System.out.println(lCHPiece.display());
		}
	}
	
}
