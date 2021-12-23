package com.xworkz.movies.dto;

public class FilmDTO {

	private String MovieName;
	private String Hero;
	private String Heroine;
	private String Director;
	private long budget;
	
	
	
	
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public String getHero() {
		return Hero;
	}
	public void setHero(String hero) {
		Hero = hero;
	}
	public String getHeroine() {
		return Heroine;
	}
	public void setHeroine(String heroine) {
		Heroine = heroine;
	}
	

	public String toString() {
		return "FilmDTO [MovieName=" + MovieName + ", Hero=" + Hero + ", Heroine=" + Heroine + ", Director=" + Director
				+ ", budget=" + budget + "]";
	}
}

