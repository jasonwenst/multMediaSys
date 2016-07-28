package com.sysgroup.mediasys.entity;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the TB_SCENE database table.
 * 
 */
@Entity
@Table(name="TB_SCENE")
//@NamedQuery(name="TbScene.findAll", query="SELECT t FROM TbScene t")
public class SceneEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SCENE_ID")
	private int sceneId;

	@Lob
	@Column(name="SCENE_LAYOUT")
	private byte[] sceneLayout;

	@Column(name="SCENE_LENGTH")
	private Integer sceneLength;

	@Column(name="SCENE_NAME")
	private String sceneName;
	
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	//bi-directional many-to-many association to TbMaterial
	@ManyToMany
	@JoinTable(
		name="TB_MATER_SCENE_REL"
		, joinColumns={
			@JoinColumn(name="SCENE_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="MATER_ID")
			}
		)
	private List<MaterialEntity> tbMaterials;

	//bi-directional many-to-one association to TbSceneShowRel
	@OneToMany(mappedBy="tbScene")
	private List<SceneShowRelEntity> tbSceneShowRels;

	public SceneEntity() {
	}

	public int getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(int sceneId) {
		this.sceneId = sceneId;
	}

	public byte[] getSceneLayout() {
		return this.sceneLayout;
	}

	public void setSceneLayout(byte[] sceneLayout) {
		this.sceneLayout = sceneLayout;
	}

	public Integer getSceneLength() {
		return this.sceneLength;
	}

	public void setSceneLength(Integer sceneLength) {
		this.sceneLength = sceneLength;
	}

	public String getSceneName() {
		return this.sceneName;
	}

	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public List<MaterialEntity> getTbMaterials() {
		return this.tbMaterials;
	}

	public void setTbMaterials(List<MaterialEntity> tbMaterials) {
		this.tbMaterials = tbMaterials;
	}

	public List<SceneShowRelEntity> getTbSceneShowRels() {
		return this.tbSceneShowRels;
	}

	public void setTbSceneShowRels(List<SceneShowRelEntity> tbSceneShowRels) {
		this.tbSceneShowRels = tbSceneShowRels;
	}

	public SceneShowRelEntity addTbSceneShowRel(SceneShowRelEntity tbSceneShowRel) {
		getTbSceneShowRels().add(tbSceneShowRel);
		tbSceneShowRel.setTbScene(this);

		return tbSceneShowRel;
	}

	public SceneShowRelEntity removeTbSceneShowRel(SceneShowRelEntity tbSceneShowRel) {
		getTbSceneShowRels().remove(tbSceneShowRel);
		tbSceneShowRel.setTbScene(null);

		return tbSceneShowRel;
	}
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "SceneEntity [sceneId=" + sceneId + ", sceneLayout=" + Arrays.toString(sceneLayout) + ", sceneLength="
				+ sceneLength + ", sceneName=" + sceneName  + "]";
	}
	
	

}