package com.racaron.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "CategoriesDetails")
public class CategoriesDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer categoriesDetailsId;

	@ManyToOne
	@JoinColumn(name = "CategoriesID")
	private Categories categories;

	@OneToMany(mappedBy = "categoriesDetails")
	private List<Community> communities;

	public Integer getCategoriesDetailsId() {
		return categoriesDetailsId;
	}

	public void setCategoriesDetailsId(Integer categoriesDetailsId) {
		this.categoriesDetailsId = categoriesDetailsId;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public List<Community> getCommunities() {
		return communities;
	}

	public void setCommunities(List<Community> communities) {
		this.communities = communities;
	}
}
