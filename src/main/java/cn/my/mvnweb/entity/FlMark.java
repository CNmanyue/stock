package cn.my.mvnweb.entity;

/**
 * FlMark entity. @author MyEclipse Persistence Tools
 */

public class FlMark implements java.io.Serializable {

	// Fields

	private Integer fmId;
	private FlPhoto flPhoto;
	private String fmMarkName;
	private Integer fmLeftL;
	private Integer fmLeftT;
	private Integer fmRightL;
	private Integer fmRightT;
	private Integer fmOrder;

	// Constructors

	/** default constructor */
	public FlMark() {
	}

	/** full constructor */
	public FlMark(FlPhoto flPhoto, String fmMarkName, Integer fmLeftL, Integer fmLeftT, Integer fmRightL, Integer fmRightT, Integer fmOrder) {
		this.flPhoto = flPhoto;
		this.fmMarkName = fmMarkName;
		this.fmLeftL = fmLeftL;
		this.fmLeftT = fmLeftT;
		this.fmRightL = fmRightL;
		this.fmRightT = fmRightT;
		this.fmOrder = fmOrder;
	}

	// Property accessors

	public Integer getFmId() {
		return this.fmId;
	}

	public void setFmId(Integer fmId) {
		this.fmId = fmId;
	}

	public FlPhoto getFlPhoto() {
		return this.flPhoto;
	}

	public void setFlPhoto(FlPhoto flPhoto) {
		this.flPhoto = flPhoto;
	}

	public String getFmMarkName() {
		return this.fmMarkName;
	}

	public void setFmMarkName(String fmMarkName) {
		this.fmMarkName = fmMarkName;
	}

	public Integer getFmLeftL() {
		return this.fmLeftL;
	}

	public void setFmLeftL(Integer fmLeftL) {
		this.fmLeftL = fmLeftL;
	}

	public Integer getFmLeftT() {
		return this.fmLeftT;
	}

	public void setFmLeftT(Integer fmLeftT) {
		this.fmLeftT = fmLeftT;
	}

	public Integer getFmRightL() {
		return this.fmRightL;
	}

	public void setFmRightL(Integer fmRightL) {
		this.fmRightL = fmRightL;
	}

	public Integer getFmRightT() {
		return this.fmRightT;
	}

	public void setFmRightT(Integer fmRightT) {
		this.fmRightT = fmRightT;
	}

	public Integer getFmOrder() {
		return this.fmOrder;
	}

	public void setFmOrder(Integer fmOrder) {
		this.fmOrder = fmOrder;
	}

}