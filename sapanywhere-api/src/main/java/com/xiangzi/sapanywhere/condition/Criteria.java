package com.xiangzi.sapanywhere.condition;

import java.io.Serializable;

public class Criteria implements Serializable {

	private static final long serialVersionUID = -8632967763171559231L;
	
	private Filter filter;
	private Expand expand;
	private Select select;

	public Criteria() {
		super();
	}

	public Criteria(Filter filter) {
		super();
		this.filter = filter;
	}
	
	public Criteria(Select select) {
		super();
		this.select = select;
	}
	
	public Criteria(Filter filter, Select select) {
		super();
		this.filter = filter;
		this.select = select;
	}
	
	public Criteria(Filter filter, Expand expand, Select select) {
		super();
		this.filter = filter;
		this.expand = expand;
		this.select = select;
	}

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	public Expand getExpand() {
		return expand;
	}

	public void setExpand(Expand expand) {
		this.expand = expand;
	}

	public Select getSelect() {
		return select;
	}

	public void setSelect(Select select) {
		this.select = select;
	}
	
}
