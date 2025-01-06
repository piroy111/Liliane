package project03ChiffresRomains.objects.column;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import basicmethods.BasicPrintMsg;
import project03ChiffresRomains.CRManager;
import project03ChiffresRomains.objects.rawnumbers.RawNumber;

public class ColumnManager {

	public ColumnManager(CRManager _sCRManager) {
		pCRManager = _sCRManager;
		/*
		 * 
		 */
		pListColumn = new ArrayList<>();
		pMapKeyToColumn = new HashMap<>();
	}
	
	/*
	 * Data
	 */
	private CRManager pCRManager;
	private List<Column> pListColumn;
	private Map<String, Column> pMapKeyToColumn;
	
	/**
	 * 
	 * @return
	 */
	public final Column getpOrCreateColumn(RawNumber _sFirst, RawNumber _sMiddle, RawNumber _sLast) {
		String lKey = Column.getKey(_sFirst, _sMiddle, _sLast);
		Column lColumn = pMapKeyToColumn.get(lKey);
		if (lColumn == null) {
			lColumn = new Column(_sFirst, _sMiddle, _sLast, this);
			pListColumn.add(lColumn);
			pMapKeyToColumn.put(lKey, lColumn);
			BasicPrintMsg.display(this, "New column created: " + lColumn);
		}
		return lColumn;		
	}
	
	/**
	 * 
	 */
	public final void sortList() {
		Collections.sort(pListColumn);
	}
	
	/*
	 * Getters & Setters
	 */
	public final CRManager getpCRManager() {
		return pCRManager;
	}
	public final List<Column> getpListColumn() {
		return pListColumn;
	}
	public final Map<String, Column> getpMapKeyToColumn() {
		return pMapKeyToColumn;
	}
	
	
	
}
