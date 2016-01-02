package cn.my.mvnweb.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * FlComment entity. @author MyEclipse Persistence Tools
 */

public class FlComment implements java.io.Serializable {

	// Fields

	private Integer fcId;
	private FlUser flUser;
	private FlComment flComment;
	private FlPhoto flPhoto;
	private Date fcCreateTime;
	private String fcComment;
	private Integer fcOrder;
	private Set flComments = new HashSet(0);

	// Constructors

	/** default constructor */
	public FlComment() {
	}

	/** full constructor */
	public FlComment(FlUser flUser, FlComment flComment, FlPhoto flPhoto, Date fcCreateTime, String fcComment, Integer fcOrder, Set flComments) {
		this.flUser = flUser;
		this.flComment = flComment;
		this.flPhoto = flPhoto;
		this.fcCreateTime = fcCreateTime;
		this.fcComment = fcComment;
		this.fcOrder = fcOrder;
		this.flComments = flComments;
	}

	// Property accessors

	public Integer getFcId() {
		return this.fcId;
	}

	public void setFcId(Integer fcId) {
		this.fcId = fcId;
	}

	public FlUser getFlUser() {
		return this.flUser;
	}

	public void setFlUser(FlUser flUser) {
		this.flUser = flUser;
	}

	public FlComment getFlComment() {
		return this.flComment;
	}

	public void setFlComment(FlComment flComment) {
		this.flComment = flComment;
	}

	public FlPhoto getFlPhoto() {
		return this.flPhoto;
	}

	public void setFlPhoto(FlPhoto flPhoto) {
		this.flPhoto = flPhoto;
	}

	public Date getFcCreateTime() {
		return this.fcCreateTime;
	}

	public void setFcCreateTime(Date fcCreateTime) {
		this.fcCreateTime = fcCreateTime;
	}

	public String getFcComment() {
		return this.fcComment;
	}

	public void setFcComment(String fcComment) {
		this.fcComment = fcComment;
	}

	public Integer getFcOrder() {
		return this.fcOrder;
	}

	public void setFcOrder(Integer fcOrder) {
		this.fcOrder = fcOrder;
	}

	public Set getFlComments() {
		return this.flComments;
	}

	public void setFlComments(Set flComments) {
		this.flComments = flComments;
	}

}