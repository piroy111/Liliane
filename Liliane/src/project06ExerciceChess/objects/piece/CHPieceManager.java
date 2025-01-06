package project06ExerciceChess.objects.piece;

import java.util.ArrayList;
import java.util.List;

import project06ExerciceChess.CHManager;

public class CHPieceManager {
	
	public CHPieceManager(CHManager _sCHManager) {
		pCHManager = _sCHManager;
	}
	
	/*
	 * Data
	 */
	private CHManager pCHManager;
	private List<CHPiece> pListCHPiece;
	
	/**
	 * 
	 */
	public final void run() {
		pListCHPiece = new ArrayList<>();
		/*
		 * 
		 */
		CHPiece lCHPieceQueenWhite = new CHPiece("Queen", "White");
		lCHPieceQueenWhite.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("Diagonal", 8));
		lCHPieceQueenWhite.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("Horizontal", 8));
		pListCHPiece.add(lCHPieceQueenWhite);
		/*
		 * 
		 */
		CHPiece lCHPieceTowerWhite = new CHPiece("Tower", "White");
		lCHPieceTowerWhite.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("Horizontal", 8));
		pListCHPiece.add(lCHPieceTowerWhite);
		/*
		 * 
		 */
		CHPiece lCHPieceBishopWhite = new CHPiece("Bishop", "White");
		lCHPieceBishopWhite.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("Diagonal", 8));
		pListCHPiece.add(lCHPieceBishopWhite);
		/*
		 * 
		 */
		CHPiece lCHPieceKingWhite = new CHPiece("King", "White");
		lCHPieceKingWhite.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("All", 1));
		pListCHPiece.add(lCHPieceKingWhite);
		/*
		 * 
		 */
		CHPiece lCHPieceKnightWhite = new CHPiece("Knight", "White");
		lCHPieceKnightWhite.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("Y type move", 1));
		pListCHPiece.add(lCHPieceKnightWhite);
		/*
		 * 
		 */
		CHPiece lCHPiecePawnWhite = new CHPiece("Pawn", "White");
		lCHPiecePawnWhite.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("Forward", 1));
		pListCHPiece.add(lCHPiecePawnWhite);
		/*
		 * 
		 */
		CHPiece lCHPieceQueenBlack = new CHPiece("Queen", "Black");
		lCHPieceQueenBlack.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("Diagonal", 8));
		lCHPieceQueenBlack.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("Horizontal", 8));
		pListCHPiece.add(lCHPieceQueenBlack);
		/*
		 * 
		 */
		CHPiece lCHPieceTowerBlack = new CHPiece("Tower", "Black");
		lCHPieceTowerBlack.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("Horizontal", 8));
		pListCHPiece.add(lCHPieceTowerBlack);
		/*
		 * 
		 */
		CHPiece lCHPieceBishopBlack = new CHPiece("Bishop", "Black");
		lCHPieceBishopBlack.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("Diagonal", 8));
		pListCHPiece.add(lCHPieceBishopBlack);
		/*
		 * 
		 */
		CHPiece lCHPieceKingBlack = new CHPiece("King", "Black");
		lCHPieceKingBlack.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("All", 1));
		pListCHPiece.add(lCHPieceKingBlack);
		/*
		 * 
		 */
		CHPiece lCHPieceKnightBlack = new CHPiece("Knight", "Black");
		lCHPieceKnightBlack.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("Y type move", 1));
		pListCHPiece.add(lCHPieceKnightBlack);
		/*
		 * 
		 */
		CHPiece lCHPiecePawnBlack = new CHPiece("Pawn", "Black");
		lCHPiecePawnBlack.addNewCHMove(pCHManager.getpCHMoveManager().createCHMove("Forward", 1));
		pListCHPiece.add(lCHPiecePawnBlack);
	}

	/*
	 * Getters & Setters
	 */
	public final List<CHPiece> getpListCHPiece() {
		return pListCHPiece;
	}
	
	
}



