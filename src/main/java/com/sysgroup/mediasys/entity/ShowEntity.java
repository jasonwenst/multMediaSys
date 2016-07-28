package com.sysgroup.mediasys.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the TB_SHOW database table.
 * 
 */
@Entity
@Table(name="TB_SHOW")
//@NamedQuery(name="TbShow.findAll", query="SELECT t FROM TbShow t")
public class ShowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SHOW_ID")
	private int showId;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="IS_ALLOW")
	private byte isAllow;

	@Column(name="SHOW_LENGTH")
	private Integer showLength;

	@Column(name="SHOW_NAME")
	private String showName;

	@Column(name="USER_ID")
	private int userId;

	//bi-directional many-to-one association to TbSceneShowRel
	@OneToMany(mappedBy="tbShow")
	private List<SceneShowRelEntity> tbSceneShowRels;

	public ShowEntity() {
	}

	public int getShowId() {
		return this.showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public byte getIsAllow() {
		return this.isAllow;
	}

	public void setIsAllow(byte isAllow) {
		this.isAllow = isAllow;
	}

	public Integer getShowLength() {
		return this.showLength;
	}

	public void setShowLength(Integer showLength) {
		this.showLength = showLength;
	}

	public String getShowName() {
		return this.showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<SceneShowRelEntity> getTbSceneShowRels() {
		return this.tbSceneShowRels;
	}

	public void setTbSceneShowRels(List<SceneShowRelEntity> tbSceneShowRels) {
		this.tbSceneShowRels = tbSceneShowRels;
	}

	public SceneShowRelEntity addTbSceneShowRel(SceneShowRelEntity tbSceneShowRel) {
		getTbSceneShowRels().add(tbSceneShowRel);
		tbSceneShowRel.setTbShow(this);

		return tbSceneShowRel;
	}

	public SceneShowRelEntity removeTbSceneShowRel(SceneShowRelEntity tbSceneShowRel) {
		getTbSceneShowRels().remove(tbSceneShowRel);
		tbSceneShowRel.setTbShow(null);

		return tbSceneShowRel;
	}

}