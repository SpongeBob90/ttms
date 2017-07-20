package cn.tedu.ttms.common.web;

import java.io.Serializable;

public class PageObject implements Serializable {
	private static final long serialVersionUID = 3840246102099221114L;
	/**总记录数*/
	private Integer rowCount;
	/**页面大小*/
	private Integer pageSize;
	/**总页数*/
	private Integer pageCount;
	/**当前页*/
	private Integer pageCurrent;
	/**当前页起始位置*/
	private Integer startIndex;
	
	public Integer getPageCount(){
		return (rowCount+pageSize-1)/pageSize;
	}
	
	public Integer getStartIndex(){
		return (pageCurrent-1)*pageSize;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageCurrent() {
		return pageCurrent;
	}

	public void setPageCurrent(Integer pageCurrent) {
		this.pageCurrent = pageCurrent;
	}

	@Override
	public String toString() {
		return "PageObject [rowCount=" + rowCount + ", pageSize=" + pageSize + ", pageCount=" + pageCount
				+ ", pageCurrent=" + pageCurrent + ", startIndex=" + startIndex + "]";
	}
	
}
