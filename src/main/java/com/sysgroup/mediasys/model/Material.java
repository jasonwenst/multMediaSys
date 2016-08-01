package com.sysgroup.mediasys.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ManyToMany;

import com.sysgroup.mediasys.entity.SceneEntity;

public class Material {

	private int materId;
	private String location;
	private String materCode;
	private String materName;
	private String materSize;
	private Integer materTime;
	private Timestamp uploadDate;
	private int userId;
	private List<SceneEntity> tbScenes;
	

	public int getMaterId() {
		return materId;
	}

	public void setMaterId(int materId) {
		this.materId = materId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMaterCode() {
		return materCode;
	}

	public void setMaterCode(String materCode) {
		this.materCode = materCode;
	}

	public String getMaterName() {
		return materName;
	}

	public void setMaterName(String materName) {
		this.materName = materName;
	}

	public String getMaterSize() {
		return materSize;
	}

	public void setMaterSize(String materSize) {
		this.materSize = materSize;
	}

	public Integer getMaterTime() {
		return materTime;
	}

	public void setMaterTime(Integer materTime) {
		this.materTime = materTime;
	}

	public Timestamp getUploadDate() {
		return uploadDate;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((materCode == null) ? 0 : materCode.hashCode());
		result = prime * result + materId;
		result = prime * result + ((materName == null) ? 0 : materName.hashCode());
		result = prime * result + ((materSize == null) ? 0 : materSize.hashCode());
		result = prime * result + ((materTime == null) ? 0 : materTime.hashCode());
		result = prime * result + ((tbScenes == null) ? 0 : tbScenes.hashCode());
		result = prime * result + ((uploadDate == null) ? 0 : uploadDate.hashCode());
		result = prime * result + userId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Material other = (Material) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (materCode == null) {
			if (other.materCode != null)
				return false;
		} else if (!materCode.equals(other.materCode))
			return false;
		if (materId != other.materId)
			return false;
		if (materName == null) {
			if (other.materName != null)
				return false;
		} else if (!materName.equals(other.materName))
			return false;
		if (materSize == null) {
			if (other.materSize != null)
				return false;
		} else if (!materSize.equals(other.materSize))
			return false;
		if (materTime == null) {
			if (other.materTime != null)
				return false;
		} else if (!materTime.equals(other.materTime))
			return false;
		if (tbScenes == null) {
			if (other.tbScenes != null)
				return false;
		} else if (!tbScenes.equals(other.tbScenes))
			return false;
		if (uploadDate == null) {
			if (other.uploadDate != null)
				return false;
		} else if (!uploadDate.equals(other.uploadDate))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
	
	
}
