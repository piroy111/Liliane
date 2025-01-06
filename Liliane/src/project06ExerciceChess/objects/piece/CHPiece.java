package project06ExerciceChess.objects.piece;

import java.util.ArrayList;
import java.util.List;

import project06ExerciceChess.objects.move.CHMove;

public class CHPiece {

	protected CHPiece(String _sName, String _sColour) {
		pName = _sName;
		pColour = _sColour;
		/*
		 * 
		 */
		initiate();
	}
	
	/*
	 * Data Intrinsic
	 */
	private String pName;
	private String pColour;
	/*
	 * Data
	 */
	private List<CHMove> pListCHMove;
	
	/**
	 * 
	 */
	protected final void initiate() {
		pListCHMove = new ArrayList<>();
	}
	
	/**
	 * 
	 */
	protected final void addNewCHMove(CHMove _sCHMove) {
		pListCHMove.add(_sCHMove);
	}
	
	/**
	 * 	
	 */
	public final String display() {
		String lDisplay = pName + " " + pColour + " can move ";;
		for (CHMove lCHMove : pListCHMove) {
			lDisplay += lCHMove.display() + "; ";
		}
		return lDisplay;
	}

	/*
	 * Getters & Setters
	 */
	public final String getpName() {
		return pName;
	}
	public final String getpColour() {
		return pColour;
	}
	public final List<CHMove> getpListCHMove() {
		return pListCHMove;
	}
	
}
