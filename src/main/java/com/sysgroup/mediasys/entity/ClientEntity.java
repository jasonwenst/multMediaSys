package com.sysgroup.mediasys.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the TB_CLIENT database table.
 * 
 */
@Entity
@Table(name="TB_CLIENT")
//@NamedQuery(name="TbClient.findAll", query="SELECT t FROM TbClient t")
public class ClientEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CLIENT_ID")
	private int clientId;

	@Column(name="CLIENT_IP")
	private String clientIp;

	@Column(name="CLIENT_LAST_CONNECT")
	private Timestamp clientLastConnect;

	@Column(name="CLIENT_MAC")
	private String clientMac;

	@Column(name="CLIENT_NAME")
	private String clientName;

	@Column(name="IS_CONNECTED")
	private boolean isConnected;

	//bi-directional many-to-one association to TbUerGroup
	@ManyToOne
	@JoinColumn(name="GROUP_ID")
	private UserGroupEntity tbUerGroup;

	//bi-directional many-to-one association to TbSendHi
//	@OneToMany(mappedBy="tbClient")
//	private List<SendHisEntity> tbSendHis;

	public ClientEntity() {
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public Timestamp getClientLastConnect() {
		return this.clientLastConnect;
	}

	public void setClientLastConnect(Timestamp clientLastConnect) {
		this.clientLastConnect = clientLastConnect;
	}

	public String getClientMac() {
		return this.clientMac;
	}

	public void setClientMac(String clientMac) {
		this.clientMac = clientMac;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public boolean getIsConnected() {
		return this.isConnected;
	}

	public void setIsConnected(boolean isConnected) {
		this.isConnected = isConnected;
	}

	

	public UserGroupEntity getTbUerGroup() {
		return this.tbUerGroup;
	}

	public void setTbUerGroup(UserGroupEntity tbUerGroup) {
		this.tbUerGroup = tbUerGroup;
	}

	@Override
	public String toString() {
		return "ClientEntity [clientId=" + clientId + ", clientIp=" + clientIp + ", clientLastConnect="
				+ clientLastConnect + ", clientMac=" + clientMac + ", clientName=" + clientName + ", isConnected="
				+ isConnected + ", tbUerGroup=" + tbUerGroup + "]";
	}

//	public List<SendHisEntity> getTbSendHis() {
//		return this.tbSendHis;
//	}
//
//	public void setTbSendHis(List<SendHisEntity> tbSendHis) {
//		this.tbSendHis = tbSendHis;
//	}

//	public SendHisEntity addTbSendHi(SendHisEntity tbSendHi) {
//		getTbSendHis().add(tbSendHi);
//		tbSendHi.setTbClient(this);
//
//		return tbSendHi;
//	}
//
//	public SendHisEntity removeTbSendHi(SendHisEntity tbSendHi) {
//		getTbSendHis().remove(tbSendHi);
//		tbSendHi.setTbClient(null);
//
//		return tbSendHi;
//	}

	
	
}