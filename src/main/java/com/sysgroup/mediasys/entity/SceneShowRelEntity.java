package com.sysgroup.mediasys.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_SCENE_SHOW_REL database table.
 * 
 */
@Entity
@Table(name="TB_SCENE_SHOW_REL")
//@NamedQuery(name="TbSceneShowRel.findAll", query="SELECT t FROM TbSceneShowRel t")
public class SceneShowRelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REL_ID")
	private int relId;

	@Column(name="SCENE_ORDER")
	private int sceneOrder;

	//bi-directional many-to-one association to TbScene
	@ManyToOne
	@JoinColumn(name="SCENE_ID")
	private SceneEntity tbScene;

	//bi-directional many-to-one association to TbShow
	@ManyToOne
	@JoinColumn(name="SHOW_ID")
	private ShowEntity tbShow;

	public SceneShowRelEntity() {
	}

	public int getRelId() {
		return this.relId;
	}

	public void setRelId(int relId) {
		this.relId = relId;
	}

	public int getSceneOrder() {
		return this.sceneOrder;
	}

	public void setSceneOrder(int sceneOrder) {
		this.sceneOrder = sceneOrder;
	}

	public SceneEntity getTbScene() {
		return this.tbScene;
	}

	public void setTbScene(SceneEntity tbScene) {
		this.tbScene = tbScene;
	}

	public ShowEntity getTbShow() {
		return this.tbShow;
	}

	public void setTbShow(ShowEntity tbShow) {
		this.tbShow = tbShow;
	}

}