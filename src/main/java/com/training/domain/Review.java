package com.training.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String reviewer;
	@Column()
	String reviewTxt;
	int rating;
	int pid;
	
	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(String reviewer, String reviewTxt, int rating, int pid) {
		super();
		
		this.reviewer = reviewer;
		this.reviewTxt = reviewTxt;
		this.rating = rating;
		this.pid = pid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public String getReviewTxt() {
		return reviewTxt;
	}

	public void setReviewTxt(String reviewTxt) {
		this.reviewTxt = reviewTxt;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	

}
