package com.sysgroup.mediasys.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.sql.Time;


/**
 * The persistent class for the TB_PLAY_CONTENT database table.
 * 
 */
@Entity
@Table(name="TB_PLAY_CONTENT")
//@NamedQuery(name="TbPlayContent.findAll", query="SELECT t FROM TbPlayContent t")
public class PlayContentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CONTENT_ID")
	private int contentId;

	@Lob
	@Column(name="CONTENT")
	private String content;

	@Column(name="CONTENT_DAY")
	private Timestamp contentDay;

	@Column(name="END_TIME")
	private Time endTime;

	@Column(name="SHOW_ID")
	private int showId;

	@Column(name="START_TIME")
	private Time startTime;

	//bi-directional many-to-one association to TbPlayPlan
	@ManyToOne
	@JoinColumn(name="PLAY_ID")
	private PlayPlanEntity tbPlayPlan;

	public PlayContentEntity() {
	}

	public int getContentId() {
		return this.contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getContentDay() {
		return this.contentDay;
	}

	public void setContentDay(Timestamp contentDay) {
		this.contentDay = contentDay;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public int getShowId() {
		return this.showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public PlayPlanEntity getTbPlayPlan() {
		return this.tbPlayPlan;
	}

	public void setTbPlayPlan(PlayPlanEntity tbPlayPlan) {
		this.tbPlayPlan = tbPlayPlan;
	}

}