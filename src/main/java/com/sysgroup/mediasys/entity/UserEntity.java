package com.sysgroup.mediasys.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the TB_USER database table.
 * 
 */
@Entity
@Table(name="TB_USER")
//@NamedQuery(name="TbUser.findAll", query="SELECT t FROM TbUser t")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	private int userId;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_PASSWD")
	private String userPasswd;

//	//bi-directional many-to-one association to TbMaterial
//	@OneToMany(mappedBy="tbUser")
//	private List<MaterialEntity> tbMaterials;
//
//	//bi-directional many-to-one association to TbSendHi
//	@OneToMany(mappedBy="tbUser")
//	private List<SendHisEntity> tbSendHis;

	//bi-directional many-to-one association to TbUerGroup
	@ManyToOne
	@JoinColumn(name="GROUP_ID")
	private UserGroupEntity tbUerGroup;

	public UserEntity() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPasswd() {
		return this.userPasswd;
	}

	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}


//	public MaterialEntity addTbMaterial(MaterialEntity tbMaterial) {
//		getTbMaterials().add(tbMaterial);
//		tbMaterial.setTbUser(this);
//
//		return tbMaterial;
//	}
//
//	public MaterialEntity removeTbMaterial(MaterialEntity tbMaterial) {
//		getTbMaterials().remove(tbMaterial);
//		tbMaterial.setTbUser(null);
//
//		return tbMaterial;
//	}
//
//	public SendHisEntity addTbSendHi(SendHisEntity tbSendHi) {
//		getTbSendHis().add(tbSendHi);
//		tbSendHi.setTbUser(this);
//
//		return tbSendHi;
//	}
//
//	public SendHisEntity removeTbSendHi(SendHisEntity tbSendHi) {
//		getTbSendHis().remove(tbSendHi);
//		tbSendHi.setTbUser(null);
//
//		return tbSendHi;
//	}

	public UserGroupEntity getTbUerGroup() {
		return this.tbUerGroup;
	}

	public void setTbUerGroup(UserGroupEntity tbUerGroup) {
		this.tbUerGroup = tbUerGroup;
	}


	
	
}