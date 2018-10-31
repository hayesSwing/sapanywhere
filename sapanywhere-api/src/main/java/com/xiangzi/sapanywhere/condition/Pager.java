package com.xiangzi.sapanywhere.condition;

import java.io.Serializable;
import java.util.List;

public class Pager implements Serializable {
	
	private static final long serialVersionUID = 1684873604608623536L;

	public static final Integer MAX_PAGE_SIZE = 100;// 每页最大记录数限制

	private Criteria criteria;
	
	private Integer pageNumber = 1;// 当前页码
	private Integer pageSize = 20;// 每页记录数
	private Integer totalCount = 0;// 总记录数
	private Integer pageCount = 0;// 总页数

	private String orderBy = "updateTime";// "creationTime";// 排序字段
	private String orderType = "desc";

	private List<?> list;// 数据List
	
	public Criteria getCriteria() {
		return criteria;
	}

	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		if (pageNumber < 1) {
			pageNumber = 1;
		}
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		if (pageSize < 1) {
			pageSize = 1;
		} else if (pageSize > MAX_PAGE_SIZE) {
			pageSize = MAX_PAGE_SIZE;
		}
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageCount() {
		pageCount = totalCount / pageSize;
		if (totalCount % pageSize > 0) {
			pageCount++;
		}
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Pager");
		sb.append("{pageNumber=").append(getPageNumber());
		sb.append(", pageSize=").append(getPageSize());
		sb.append(", pageCount=").append(getPageCount());
		sb.append(", totalCount=").append(getTotalCount());
		sb.append(", orderBy=").append(getOrderBy());
		sb.append(", orderType=").append(getOrderType());
		sb.append(", offset=").append(getOffset());
		sb.append(", limit=").append(getLimit());
		sb.append(", list=").append(list);
		sb.append('}');
		return sb.toString();
	}

	public int getOffset() {
		if (this.pageNumber >= 1) {
			return (this.pageNumber - 1) * getLimit();
		}
		return 0;
	}

	public int getLimit() {
		return pageSize;
	}

}
