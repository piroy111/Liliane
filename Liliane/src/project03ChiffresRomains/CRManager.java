package project03ChiffresRomains;

import project03ChiffresRomains.computor.ComputorIntegerToRoman;
import project03ChiffresRomains.computor.ComputorRomanToInteger;
import project03ChiffresRomains.initiate.Initiator;
import project03ChiffresRomains.objects.column.ColumnManager;
import project03ChiffresRomains.objects.rawnumbers.RawNumberManager;
import project03ChiffresRomains.testor.Testor;

public class CRManager {

	public CRManager() {
		pColumnManager = new ColumnManager(this);
		pRawNumberManager = new RawNumberManager(this);
		pInitiator = new Initiator(this);
		pComputorIntegerToRoman = new ComputorIntegerToRoman(this);
		pComputorRomanToInteger = new ComputorRomanToInteger(this);
		pTestor = new Testor(this);
	}
	
	/*
	 * Data
	 */
	private ColumnManager pColumnManager;
	private RawNumberManager pRawNumberManager;
	private Initiator pInitiator;
	private ComputorIntegerToRoman pComputorIntegerToRoman;
	private ComputorRomanToInteger pComputorRomanToInteger;
	private Testor pTestor;
	
	/**
	 * 
	 */
	public final void run() {
		pInitiator.run();
		pTestor.run();
	}

	/*
	 * Getters & Setters
	 */
	public final ColumnManager getpColumnManager() {
		return pColumnManager;
	}
	public final RawNumberManager getpRawNumberManager() {
		return pRawNumberManager;
	}
	public final Initiator getpInitiator() {
		return pInitiator;
	}
	public final ComputorIntegerToRoman getpComputorIntegerToRoman() {
		return pComputorIntegerToRoman;
	}
	public final ComputorRomanToInteger getpComputorRomanToInteger() {
		return pComputorRomanToInteger;
	}
	public final Testor getpTestor() {
		return pTestor;
	}
	
}
