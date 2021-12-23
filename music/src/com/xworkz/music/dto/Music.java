package com.xworkz.music.dto;

public class Music 
{
	
	private String film;
	private int minutes;
	private String language;
	private Singer song;
	public void setFilm(String film) {
		this.film=film;
	}
	public String getFilm() {
		return film;
	}
	public void setMinutes(int minutes) {
		this.minutes=minutes;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setLanguage(String language) {
		this.language=language;
	}
	public String getLanguage() {
		return language;
	}
	public void setSinger(Singer song) {
		this.song=song;
	}
	public Singer getSinger() {
		return song;
	}

	public String getAll() {
		return film+"\t"+minutes+"\t"+language+"\t"+song.getAll();
	}
	}



