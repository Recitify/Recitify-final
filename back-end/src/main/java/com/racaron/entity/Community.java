package com.racaron.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Community")
public class Community implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer communityId;

	@ManyToOne
	@JoinColumn(name = "CategoriesDetailsID")
	private CategoriesDetails categoriesDetails;

	@ManyToOne
	@JoinColumn(name = "PostID")
	private Post post;

	private String teamName;
	private String teamAddress;
	private String teamPhone;
	private String avatar;
	private String coordinates;
	private Boolean isWork;

	public Integer getCommunityId() {
		return communityId;
	}

	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}

	public CategoriesDetails getCategoriesDetails() {
		return categoriesDetails;
	}

	public void setCategoriesDetails(CategoriesDetails categoriesDetails) {
		this.categoriesDetails = categoriesDetails;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamAddress() {
		return teamAddress;
	}

	public void setTeamAddress(String teamAddress) {
		this.teamAddress = teamAddress;
	}

	public String getTeamPhone() {
		return teamPhone;
	}

	public void setTeamPhone(String teamPhone) {
		this.teamPhone = teamPhone;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public Boolean getIsWork() {
		return isWork;
	}

	public void setIsWork(Boolean isWork) {
		this.isWork = isWork;
	}

}
