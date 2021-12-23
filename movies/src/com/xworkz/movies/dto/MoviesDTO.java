package com.xworkz.movies.dto;

public class MoviesDTO {

	private String joner;
	private String language;
	private float duration;
	private FilmDTO film;
	
	public FilmDTO getFilm() {
		return film;
	}
	public void setFilm(FilmDTO film) {
		this.film = film;
	}
	public String getJoner() {
		return joner;
	}
	public void setJoner(String joner) {
		this.joner = joner;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	
	public String toString() {
		return "MoviesDTO [joner=" + joner + ", language=" + language + ", duration=" + duration + ", film=" + film
				+ "]";
	}
	
	
	
	
}
