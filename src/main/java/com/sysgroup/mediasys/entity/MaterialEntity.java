package com.sysgroup.mediasys.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the TB_MATERIAL database table.
 * 
 */
@Entity
@Table(name="TB_MATERIAL")
//@NamedQuery(name="TbMaterial.findAll", query="SELECT t FROM TbMaterial t")
public class MaterialEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MATER_ID")
	private int materId;

	@Column(name="LOCATION")
	private String location;

	@Column(name="MATER_CODE")
	private String materCode;

	@Column(name="MATER_NAME")
	private String materName;

	@Column(name="MATER_SIZE")
	private String materSize;

	@Column(name="MATER_TIME")
	private Integer materTime;

	@Column(name="UPLOAD_DATE")
	private Timestamp uploadDate;

	//bi-directional many-to-one association to TbUser
//	@ManyToOne
	@Column(name="USER_ID")
	private int userId;

	//bi-directional many-to-many association to TbScene
	@ManyToMany(mappedBy="tbMaterials")
	private List<SceneEntity> tbScenes;

	public MaterialEntity() {
	}

	public int getMaterId() {
		return this.materId;
	}

	public void setMaterId(int materId) {
		this.materId = materId;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMaterCode() {
		return this.materCode;
	}

	public void setMaterCode(String materCode) {
		this.materCode = materCode;
	}

	public String getMaterName() {
		return this.materName;
	}

	public void setMaterName(String materName) {
		this.materName = materName;
	}

	public String getMaterSize() {
		return this.materSize;
	}

	public void setMaterSize(String materSize) {
		this.materSize = materSize;
	}

	public Integer getMaterTime() {
		return this.materTime;
	}

	public void setMaterTime(Integer materTime) {
		this.materTime = materTime;
	}

	public Timestamp getUploadDate() {
		return this.uploadDate;
	}

	public void setUploadDate(Timestamp uploadDate) {
		this.uploadDate = uploadDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<SceneEntity> getTbScenes() {
		return tbScenes;
	}

	public void setTbScenes(List<SceneEntity> tbScenes) {
		this.tbScenes = tbScenes;
	}

	@Override
	public String toString() {
		return "MaterialEntity [materId=" + materId + ", location=" + location + ", materCode=" + materCode
				+ ", materName=" + materName + ", materSize=" + materSize + ", materTime=" + materTime + ", uploadDate="
				+ uploadDate + ", userId=" + userId + "]";
	}


	

}