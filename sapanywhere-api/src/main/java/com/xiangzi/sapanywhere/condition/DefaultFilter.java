package com.xiangzi.sapanywhere.condition;

public class DefaultFilter implements Filter {

	private static final long serialVersionUID = -3550018238684386224L;
	
	private String sql;

	public String getSql() {
		return sql;
	}

	protected DefaultFilter() {
	}

	public DefaultFilter(String sql) {
		this.sql = sql;
	}

	public DefaultFilter(String name, String relation, String value) {
		this.sql = name + " " + relation + " " + value;
	}

	public DefaultFilter(Filter c1, Filter c2, String relation) {
		this("(" + c1.toSqlString() + ") " + relation + " (" + c2.toSqlString() + " )");
	}
	
	@Override
	public String toSqlString() {
		return sql;
	}

}