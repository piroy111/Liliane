package project06ExerciceChess.objects.move;

public class CHMove {

	protected CHMove(String _sWayOfMoving, int _sNbSquareMax) {
		pWayOfMoving = _sWayOfMoving;
		pNbSquareMax = _sNbSquareMax;
	}
	
	/*
	 * Data
	 */
	private String pWayOfMoving;
	private int pNbSquareMax;
	
	/**
	 * 	
	 */
	public final String display() {
		return pWayOfMoving + " max " + pNbSquareMax + " squares";
	}
	
	/*
	 * Getters & Setters
	 */
	public final String getpWayOfMoving() {
		return pWayOfMoving;
	}
	public final int getpNbSquareMax() {
		return pNbSquareMax;
	}
}
