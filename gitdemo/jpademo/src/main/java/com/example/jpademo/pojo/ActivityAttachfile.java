package com.example.jpademo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_activity_attachfile")
public class ActivityAttachfile {
	@Id
    @GeneratedValue(strategy=GenerationType.TABLE)
//	@GeneratedValue(strategy=GenerationType.TABLE)
    private Integer id;
   
	/**
	 * @comment 信息分类  1：活动类 2：会议类 3：学习培训类 9：其他
	 */
	private Integer infoType;

	/**
	 * @comment 对应具体信息记录ID
	 */
	private Integer infoId;

	
	/**
	 * @comment 附件ID
	 */
	private Integer attachId;

	/**
	 * @comment 附件类型
	 */
	private Integer attachType;
 
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getInfoType() {
		return infoType;
	}


	public void setInfoType(Integer infoType) {
		this.infoType = infoType;
	}


	public Integer getInfoId() {
		return infoId;
	}


	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}


	public Integer getAttachId() {
		return attachId;
	}


	public void setAttachId(Integer attachId) {
		this.attachId = attachId;
	}


	public Integer getAttachType() {
		return attachType;
	}


	public void setAttachType(Integer attachType) {
		this.attachType = attachType;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + infoType + ", email=" + infoId + "]";
	}
    
}
