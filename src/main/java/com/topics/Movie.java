package com.topics;

public class Movie {

	private int id;
	private String title;
	private String description;
	private String release_on;
	private String cast;
	private long budget;
	
	public Movie() {
		
	}
	
	public Movie(int id, String title, String description, String release_on, String cast, long budget) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.release_on = release_on;
		this.cast = cast;
		this.budget = budget;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRelease_on() {
		return release_on;
	}
	public void setRelease_on(String release_on) {
		this.release_on = release_on;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	
}
