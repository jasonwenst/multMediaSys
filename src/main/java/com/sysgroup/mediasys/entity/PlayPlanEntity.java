package com.sysgroup.mediasys.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the TB_PLAY_PLAN database table.
 * 
 */
@Entity
@Table(name="TB_PLAY_PLAN")
//@NamedQuery(name="TbPlayPlan.findAll", query="SELECT t FROM TbPlayPlan t")
public class PlayPlanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PLAY_ID")
	private int playId;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;

	@Column(name="PLAY_NAME")
	private String playName;

	@Column(name="PLAY_TYPE")
	private String playType;

	@Column(name="USER_ID")
	private int userId;

	//bi-directional many-to-one association to TbPlayContent
	@OneToMany(mappedBy="tbPlayPlan")
	private List<PlayContentEntity> tbPlayContents;

	//bi-directional many-to-one association to TbSendHi
	@OneToMany(mappedBy="tbPlayPlan")
	private List<SendHisEntity> tbSendHis;

	public PlayPlanEntity() {
	}

	public int getPlayId() {
		return this.playId;
	}

	public void setPlayId(int playId) {
		this.playId = playId;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getPlayName() {
		return this.playName;
	}

	public void setPlayName(String playName) {
		this.playName = playName;
	}

	public String getPlayType() {
		return this.playType;
	}

	public void setPlayType(String playType) {
		this.playType = playType;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<PlayContentEntity> getTbPlayContents() {
		return this.tbPlayContents;
	}

	public void setTbPlayContents(List<PlayContentEntity> tbPlayContents) {
		this.tbPlayContents = tbPlayContents;
	}

	public PlayContentEntity addTbPlayContent(PlayContentEntity tbPlayContent) {
		getTbPlayContents().add(tbPlayContent);
		tbPlayContent.setTbPlayPlan(this);

		return tbPlayContent;
	}

	public PlayContentEntity removeTbPlayContent(PlayContentEntity tbPlayContent) {
		getTbPlayContents().remove(tbPlayContent);
		tbPlayContent.setTbPlayPlan(null);

		return tbPlayContent;
	}

	public List<SendHisEntity> getTbSendHis() {
		return this.tbSendHis;
	}

	public void setTbSendHis(List<SendHisEntity> tbSendHis) {
		this.tbSendHis = tbSendHis;
	}

	public SendHisEntity addTbSendHi(SendHisEntity tbSendHi) {
		getTbSendHis().add(tbSendHi);
		tbSendHi.setTbPlayPlan(this);

		return tbSendHi;
	}

	public SendHisEntity removeTbSendHi(SendHisEntity tbSendHi) {
		getTbSendHis().remove(tbSendHi);
		tbSendHi.setTbPlayPlan(null);

		return tbSendHi;
	}

}