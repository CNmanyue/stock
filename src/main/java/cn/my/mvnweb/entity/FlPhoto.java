package cn.my.mvnweb.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * FlPhoto entity. @author MyEclipse Persistence Tools
 */

public class FlPhoto implements java.io.Serializable {

	// Fields

	private Integer fpPhotoId;
	private FlAlbum flAlbum;
	private Date fpCreateTime;
	private String fpName;
	private String fpContentType;
	private String fpContent;
	private String fpThumbnail;
	private Integer fpOrder;
	private Set flMarks = new HashSet(0);
	private Set flActivities = new HashSet(0);
	private Set flComments = new HashSet(0);

	// Constructors

	/** default constructor */
	public FlPhoto() {
	}

	/** full constructor */
	public FlPhoto(FlAlbum flAlbum, Date fpCreateTime, String fpName, String fpContentType, String fpContent, String fpThumbnail, Integer fpOrder, Set flMarks, Set flActivities, Set flComments) {
		this.flAlbum = flAlbum;
		this.fpCreateTime = fpCreateTime;
		this.fpName = fpName;
		this.fpContentType = fpContentType;
		this.fpContent = fpContent;
		this.fpThumbnail = fpThumbnail;
		this.fpOrder = fpOrder;
		this.flMarks = flMarks;
		this.flActivities = flActivities;
		this.flComments = flComments;
	}

	// Property accessors

	public Integer getFpPhotoId() {
		return this.fpPhotoId;
	}

	public void setFpPhotoId(Integer fpPhotoId) {
		this.fpPhotoId = fpPhotoId;
	}

	public FlAlbum getFlAlbum() {
		return this.flAlbum;
	}

	public void setFlAlbum(FlAlbum flAlbum) {
		this.flAlbum = flAlbum;
	}

	public Date getFpCreateTime() {
		return this.fpCreateTime;
	}

	public void setFpCreateTime(Date fpCreateTime) {
		this.fpCreateTime = fpCreateTime;
	}

	public String getFpName() {
		return this.fpName;
	}

	public void setFpName(String fpName) {
		this.fpName = fpName;
	}

	public String getFpContentType() {
		return this.fpContentType;
	}

	public void setFpContentType(String fpContentType) {
		this.fpContentType = fpContentType;
	}

	public String getFpContent() {
		return this.fpContent;
	}

	public void setFpContent(String fpContent) {
		this.fpContent = fpContent;
	}

	public String getFpThumbnail() {
		return this.fpThumbnail;
	}

	public void setFpThumbnail(String fpThumbnail) {
		this.fpThumbnail = fpThumbnail;
	}

	public Integer getFpOrder() {
		return this.fpOrder;
	}

	public void setFpOrder(Integer fpOrder) {
		this.fpOrder = fpOrder;
	}

	public Set getFlMarks() {
		return this.flMarks;
	}

	public void setFlMarks(Set flMarks) {
		this.flMarks = flMarks;
	}

	public Set getFlActivities() {
		return this.flActivities;
	}

	public void setFlActivities(Set flActivities) {
		this.flActivities = flActivities;
	}

	public Set getFlComments() {
		return this.flComments;
	}

	public void setFlComments(Set flComments) {
		this.flComments = flComments;
	}

}