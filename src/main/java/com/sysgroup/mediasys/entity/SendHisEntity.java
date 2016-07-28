package com.sysgroup.mediasys.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TB_SEND_HIS database table.
 * 
 */
@Entity
@Table(name="TB_SEND_HIS")
//@NamedQuery(name="SendHisEntity.findAll", query="SELECT t FROM SendHisEntity t")
public class SendHisEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="HIS_ID")
	private int hisId;

	@Column(name="SEND_TIME")
	private Timestamp sendTime;

	@Column(name="STATE")
	private String state;

	//bi-directional many-to-one association to TbUser
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private UserEntity tbUser;

	//bi-directional many-to-one association to TbClient
	@ManyToOne
	@JoinColumn(name="CLIENT_ID")
	private ClientEntity tbClient;

	//bi-directional many-to-one association to TbPlayPlan
	@ManyToOne
	@JoinColumn(name="PLAY_ID")
	private PlayPlanEntity tbPlayPlan;

	public SendHisEntity() {
	}

	public int getHisId() {
		return this.hisId;
	}

	public void setHisId(int hisId) {
		this.hisId = hisId;
	}

	public Timestamp getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public UserEntity getTbUser() {
		return this.tbUser;
	}

	public void setTbUser(UserEntity tbUser) {
		this.tbUser = tbUser;
	}

	public ClientEntity getTbClient() {
		return this.tbClient;
	}

	public void setTbClient(ClientEntity tbClient) {
		this.tbClient = tbClient;
	}

	public PlayPlanEntity getTbPlayPlan() {
		return this.tbPlayPlan;
	}

	public void setTbPlayPlan(PlayPlanEntity tbPlayPlan) {
		this.tbPlayPlan = tbPlayPlan;
	}

}