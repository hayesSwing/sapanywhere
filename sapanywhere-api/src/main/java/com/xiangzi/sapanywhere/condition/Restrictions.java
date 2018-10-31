package com.xiangzi.sapanywhere.condition;

import java.io.Serializable;

public class Restrictions implements Serializable {

	private static final long serialVersionUID = -5318163684376664953L;

	/**
	 * 值添加''
	 */
	private static String generateValue(Object value) {
		return "'" + value + "'";
	}

	private static Filter generateFilter(String name, String relation, Object value, boolean noWrap) {
		return new DefaultFilter(name, relation, noWrap ? value.toString() : generateValue(value));
	}

	/**
	 * Equals <br/>
	 * 等于(=)条件
	 */
	public static Filter eq(String name, Object value) {
		return eq(name, value, false);
	}

	/**
	 * Equals <br/>
	 * 等于(=)条件
	 * 
	 * @param name
	 * @param value
	 * @param noWrap
	 *            值是否添加''
	 * @return
	 */
	public static Filter eq(String name, Object value, boolean noWrap) {
		return generateFilter(name, "eq", value, noWrap);
	}

	/**
	 * Not Equals <br/>
	 * 不等于(<>)条件
	 */
	public static Filter notEq(String name, Object value) {
		return notEq(name, value, false);
	}

	/**
	 * Not Equals <br/>
	 * 不等于(<>)条件
	 */
	public static Filter notEq(String name, Object value, boolean noWrap) {
		return generateFilter(name, "ne", value, noWrap);
	}

	/**
	 * Greater Than <br/>
	 * 大于(>)条件
	 */
	public static Filter gt(String name, Object value) {
		return gt(name, value, false);
	}

	/**
	 * Greater Than <br/>
	 * 大于(>)条件
	 */
	public static Filter gt(String name, Object value, boolean noWrap) {
		return generateFilter(name, "gt", value, noWrap);
	}

	/**
	 * Greater Than or Equal <br/>
	 * 大于等于(>=)条件
	 */
	public static Filter ge(String name, Object value) {
		return ge(name, value, false);
	}

	/**
	 * Greater Than or Equal <br/>
	 * 大于等于(>=)条件
	 */
	public static Filter ge(String name, Object value, boolean noWrap) {
		return generateFilter(name, "ge", value, noWrap);
	}

	/**
	 * Less Than <br/>
	 * 小于(<)条件
	 */
	public static Filter lt(String name, Object value) {
		return lt(name, value, false);
	}

	/**
	 * Less Than <br/>
	 * 小于(<)条件
	 */
	public static Filter lt(String name, Object value, boolean noWrap) {
		return generateFilter(name, "lt", value, noWrap);
	}

	/**
	 * Less Than or Equal <br/>
	 * 小于等于(<=)条件
	 */
	public static Filter le(String name, Object value) {
		return le(name, value, false);
	}

	/**
	 * Less Than or Equal <br/>
	 * 小于等于(<=)条件
	 */
	public static Filter le(String name, Object value, boolean noWrap) {
		return generateFilter(name, "le", value, noWrap);
	}

	/**
	 * And <br/>
	 * 并且(AND)条件
	 */
	public static Filter and(Filter f1, Filter f2) {
		return new DefaultFilter(f1, f2, "and");
	}

	/**
	 * Or <br/>
	 * 或者(OR)条件
	 */
	public static Filter or(Filter f1, Filter f2) {
		return new DefaultFilter(f1, f2, "or");
	}

}