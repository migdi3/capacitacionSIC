package com.ad364.drl_rulebc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AvailableRows implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Available Rows")
	private java.util.List<java.lang.Integer> rows = new java.util.ArrayList<Integer>();

	public AvailableRows() {
	}

	public java.util.List<java.lang.Integer> getRows() {
		return this.rows;
	}

	public void setRows(java.util.List<java.lang.Integer> rows) {
		this.rows = rows;
	}

	public AvailableRows(java.util.List<java.lang.Integer> rows) {
		this.rows = rows;
	}
	
	@Override
	public String toString() {
		return rows.toString();
	}

}