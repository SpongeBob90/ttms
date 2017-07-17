package cn.tedu.ttms.project.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**��Ŀʵ����*/
public class Project implements Serializable {
	private static final long serialVersionUID = -1014706805161374436L;
	/**��Ŀid*/
	private Integer id;
	/**��Ŀ���*/
	private String code;
	/**��Ŀ����*/
	private String name;
	/**��ʼʱ��*/
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date beginDate;
	/**����ʱ��*/
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	/**״̬(���á�����)*/
	private Integer valid;
	/**��ע*/
	private String note;
	/**����ʱ��*/
	private Date createdTime;
	/**������*/
	private String createdUser;
	/**�޸�ʱ��*/
	private Date modifiedTime;
	/**�޸���*/
	private String modifiedUser;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getBeginDate() {
		return beginDate;
	}
	
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Integer getValid() {
		return valid;
	}
	
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public Date getCreatedTime() {
		return createdTime;
	}
	
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	public String getCreatedUser() {
		return createdUser;
	}
	
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	
	public Date getModifiedTime() {
		return modifiedTime;
	}
	
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	
	public String getModifiedUser() {
		return modifiedUser;
	}
	
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", code=" + code + ", name=" + name + "]";
	}
}
