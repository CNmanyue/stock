package cn.my.mvnweb.entity;

/**
 * FlRelation entity. @author MyEclipse Persistence Tools
 */

public class FlRelation implements java.io.Serializable {

	// Fields

	private Integer frId;
	private FlUser flUserByFu2Id;
	private FlUser flUserByFu1Id;
	private Integer frRelation;

	// Constructors

	/** default constructor */
	public FlRelation() {
	}

	/** full constructor */
	public FlRelation(FlUser flUserByFu2Id, FlUser flUserByFu1Id, Integer frRelation) {
		this.flUserByFu2Id = flUserByFu2Id;
		this.flUserByFu1Id = flUserByFu1Id;
		this.frRelation = frRelation;
	}

	// Property accessors

	public Integer getFrId() {
		return this.frId;
	}

	public void setFrId(Integer frId) {
		this.frId = frId;
	}

	public FlUser getFlUserByFu2Id() {
		return this.flUserByFu2Id;
	}

	public void setFlUserByFu2Id(FlUser flUserByFu2Id) {
		this.flUserByFu2Id = flUserByFu2Id;
	}

	public FlUser getFlUserByFu1Id() {
		return this.flUserByFu1Id;
	}

	public void setFlUserByFu1Id(FlUser flUserByFu1Id) {
		this.flUserByFu1Id = flUserByFu1Id;
	}

	public Integer getFrRelation() {
		return this.frRelation;
	}

	public void setFrRelation(Integer frRelation) {
		this.frRelation = frRelation;
	}

}