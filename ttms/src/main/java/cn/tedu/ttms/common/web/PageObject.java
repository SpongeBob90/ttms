package cn.tedu.ttms.common.web;

import java.io.Serializable;

public class PageObject implements Serializable {
	private static final long serialVersionUID = 3840246102099221114L;
	/**�ܼ�¼��*/
	private Integer rowCount;
	/**ҳ���С*/
	private Integer pageSize;
	/**��ҳ��*/
	private Integer pageCount;
	/**��ǰҳ*/
	private Integer pageCurrent;
	/**��ǰҳ��ʼλ��*/
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
