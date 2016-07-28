package com.sysgroup.mediasys.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TB_UER_GROUP database table.
 * 
 */
@Entity
@Table(name="TB_UER_GROUP")
//@NamedQuery(name="TbUerGroup.findAll", query="SELECT t FROM TbUerGroup t")
public class UserGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GROUP_ID")
	private int groupId;

	@Column(name="GROUP_DECP")
	private String groupDecp;

	@Column(name="GROUP_NAME")
	private String groupName;

	//bi-directional many-to-one association to TbClient
	@OneToMany(mappedBy="tbUerGroup")
	private List<ClientEntity> tbClients;

	//bi-directional many-to-one association to TbUser
	@OneToMany(mappedBy="tbUerGroup")
	private List<UserEntity> tbUsers;

	public UserGroupEntity() {
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupDecp() {
		return this.groupDecp;
	}

	public void setGroupDecp(String groupDecp) {
		this.groupDecp = groupDecp;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<ClientEntity> getTbClients() {
		return this.tbClients;
	}

	public void setTbClients(List<ClientEntity> tbClients) {
		this.tbClients = tbClients;
	}

	public ClientEntity addTbClient(ClientEntity tbClient) {
		getTbClients().add(tbClient);
		tbClient.setTbUerGroup(this);

		return tbClient;
	}

	public ClientEntity removeTbClient(ClientEntity tbClient) {
		getTbClients().remove(tbClient);
		tbClient.setTbUerGroup(null);

		return tbClient;
	}

	public List<UserEntity> getTbUsers() {
		return this.tbUsers;
	}

	public void setTbUsers(List<UserEntity> tbUsers) {
		this.tbUsers = tbUsers;
	}

	public UserEntity addTbUser(UserEntity tbUser) {
		getTbUsers().add(tbUser);
		tbUser.setTbUerGroup(this);

		return tbUser;
	}

	public UserEntity removeTbUser(UserEntity tbUser) {
		getTbUsers().remove(tbUser);
		tbUser.setTbUerGroup(null);

		return tbUser;
	}

	@Override
	public String toString() {
		return "UserGroupEntity [groupId=" + groupId + ", groupDecp=" + groupDecp + ", groupName=" + groupName
				+ ", tbClients=" + tbClients.toString() + ", tbUsers=" + tbUsers.toString() + "]";
	}

	


	
	
}