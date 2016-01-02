package cn.my.mvnweb.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * FlUser entity. @author MyEclipse Persistence Tools
 */

public class FlUser implements java.io.Serializable {

	// Fields

	private String fuUserId;
	private String fuUserName;
	private String fuPassword;
	private String fuEmail;
	private Integer fuStatus;
	private Set flRelationsForFu1Id = new HashSet(0);
	private Set flRelationsForFu2Id = new HashSet(0);
	private Set flAlbums = new HashSet(0);
	private Set flActivities = new HashSet(0);
	private Set flComments = new HashSet(0);

	// Constructors

	/** default constructor */
	public FlUser() {
	}

	/** full constructor */
	public FlUser(String fuUserName, String fuPassword, String fuEmail, Integer fuStatus, Set flRelationsForFu1Id, Set flRelationsForFu2Id, Set flAlbums, Set flActivities, Set flComments) {
		this.fuUserName = fuUserName;
		this.fuPassword = fuPassword;
		this.fuEmail = fuEmail;
		this.fuStatus = fuStatus;
		this.flRelationsForFu1Id = flRelationsForFu1Id;
		this.flRelationsForFu2Id = flRelationsForFu2Id;
		this.flAlbums = flAlbums;
		this.flActivities = flActivities;
		this.flComments = flComments;
	}

	// Property accessors

	public String getFuUserId() {
		return this.fuUserId;
	}

	public void setFuUserId(String fuUserId) {
		this.fuUserId = fuUserId;
	}

	public String getFuUserName() {
		return this.fuUserName;
	}

	public void setFuUserName(String fuUserName) {
		this.fuUserName = fuUserName;
	}

	public String getFuPassword() {
		return this.fuPassword;
	}

	public void setFuPassword(String fuPassword) {
		this.fuPassword = fuPassword;
	}

	public String getFuEmail() {
		return this.fuEmail;
	}

	public void setFuEmail(String fuEmail) {
		this.fuEmail = fuEmail;
	}

	public Integer getFuStatus() {
		return this.fuStatus;
	}

	public void setFuStatus(Integer fuStatus) {
		this.fuStatus = fuStatus;
	}

	public Set getFlRelationsForFu1Id() {
		return this.flRelationsForFu1Id;
	}

	public void setFlRelationsForFu1Id(Set flRelationsForFu1Id) {
		this.flRelationsForFu1Id = flRelationsForFu1Id;
	}

	public Set getFlRelationsForFu2Id() {
		return this.flRelationsForFu2Id;
	}

	public void setFlRelationsForFu2Id(Set flRelationsForFu2Id) {
		this.flRelationsForFu2Id = flRelationsForFu2Id;
	}

	public Set getFlAlbums() {
		return this.flAlbums;
	}

	public void setFlAlbums(Set flAlbums) {
		this.flAlbums = flAlbums;
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