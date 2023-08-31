package com.ad364.drl_rulebc;

public class RowPopulator {
	public static AvailableRows populateRows(Integer startRow, Integer endRow) {
		AvailableRows rows = new AvailableRows();
		return addMoreRows(rows, startRow, endRow);
	}
	
	public static AvailableRows addMoreRows(AvailableRows rows, Integer startRow, Integer endRow) {
		for (int i = startRow; i <= endRow; i++) {
			rows.getRows().add(i);
		}		
		return rows;
	}
}