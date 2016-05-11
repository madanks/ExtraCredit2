package com.extracredit.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Comment {
	@Id
	@GeneratedValue
	private int id;

	private String comment;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "user")
	private User user;

	@ManyToOne()
	@JoinColumn(name = "movie")
	private Movie movie;

	public Comment() {

	}

	public Comment(String comment, Date datetime, User user) {
		this.comment = comment;
		this.datetime = datetime;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public String getComment() {
		return comment;
	}

	public Date getDatetime() {
		return datetime;
	}

	public User getUser() {
		return user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

}
