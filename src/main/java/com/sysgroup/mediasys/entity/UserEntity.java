package com.sysgroup.mediasys.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String userName;
	
	private String address;
	
	private String email;
	
	private String ssoId;
	
	private String password;

	

	public UserEntity() {
		super();
	}


	public UserEntity(Long id, String userName, String address, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.address = address;
		this.email = email;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getSsoId() {
		return ssoId;
	}


	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + userName + ", address=" + address + ", email=" + email
				+ ", ssoId=" + ssoId + ", password=" + password + "]";
	}

}
