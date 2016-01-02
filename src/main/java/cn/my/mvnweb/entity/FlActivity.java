package cn.my.mvnweb.entity;

import java.sql.Timestamp;

/**
 * FlActivity entity. @author MyEclipse Persistence Tools
 */

public class FlActivity implements java.io.Serializable {

	// Fields

	private Integer faId;
	private FlUser flUser;
	private FlPhoto flPhoto;
	private Timestamp faTime;
	private Integer faType;
	private Integer fcId;
	private Integer fmId;

	// Constructors

	/** default constructor */
	public FlActivity() {
	}

	/** full constructor */
	public FlActivity(FlUser flUser, FlPhoto flPhoto, Timestamp faTime, Integer faType, Integer fcId, Integer fmId) {
		this.flUser = flUser;
		this.flPhoto = flPhoto;
		this.faTime = faTime;
		this.faType = faType;
		this.fcId = fcId;
		this.fmId = fmId;
	}

	// Property accessors

	public Integer getFaId() {
		return this.faId;
	}

	public void setFaId(Integer faId) {
		this.faId = faId;
	}

	public FlUser getFlUser() {
		return this.flUser;
	}

	public void setFlUser(FlUser flUser) {
		this.flUser = flUser;
	}

	public FlPhoto getFlPhoto() {
		return this.flPhoto;
	}

	public void setFlPhoto(FlPhoto flPhoto) {
		this.flPhoto = flPhoto;
	}

	public Timestamp getFaTime() {
		return this.faTime;
	}

	public void setFaTime(Timestamp faTime) {
		this.faTime = faTime;
	}

	public Integer getFaType() {
		return this.faType;
	}

	public void setFaType(Integer faType) {
		this.faType = faType;
	}

	public Integer getFcId() {
		return this.fcId;
	}

	public void setFcId(Integer fcId) {
		this.fcId = fcId;
	}

	public Integer getFmId() {
		return this.fmId;
	}

	public void setFmId(Integer fmId) {
		this.fmId = fmId;
	}

}