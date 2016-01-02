package cn.my.mvnweb.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * FlAlbum entity. @author MyEclipse Persistence Tools
 */

public class FlAlbum implements java.io.Serializable {

	// Fields

	private Integer faAlbumId;
	private FlUser flUser;
	private String faAlbumName;
	private Integer faLimit;
	private Set flPhotos = new HashSet(0);

	// Constructors

	/** default constructor */
	public FlAlbum() {
	}

	/** full constructor */
	public FlAlbum(FlUser flUser, String faAlbumName, Integer faLimit, Set flPhotos) {
		this.flUser = flUser;
		this.faAlbumName = faAlbumName;
		this.faLimit = faLimit;
		this.flPhotos = flPhotos;
	}

	// Property accessors

	public Integer getFaAlbumId() {
		return this.faAlbumId;
	}

	public void setFaAlbumId(Integer faAlbumId) {
		this.faAlbumId = faAlbumId;
	}

	public FlUser getFlUser() {
		return this.flUser;
	}

	public void setFlUser(FlUser flUser) {
		this.flUser = flUser;
	}

	public String getFaAlbumName() {
		return this.faAlbumName;
	}

	public void setFaAlbumName(String faAlbumName) {
		this.faAlbumName = faAlbumName;
	}

	public Integer getFaLimit() {
		return this.faLimit;
	}

	public void setFaLimit(Integer faLimit) {
		this.faLimit = faLimit;
	}

	public Set getFlPhotos() {
		return this.flPhotos;
	}

	public void setFlPhotos(Set flPhotos) {
		this.flPhotos = flPhotos;
	}

}