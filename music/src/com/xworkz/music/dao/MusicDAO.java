package com.xworkz.music.dao;

import com.xworkz.music.dto.Music;

public class MusicDAO {
	Music[] dtos=new Music[5];
	int index=0;
	public String insert(Music dto) {
		if(dto==null) {
			return "this is null object";
		}
		else
		{
			dtos[index]=dto;
			System.out.println(dtos[index].getFilm());
			index++;
			return "object added with the company name"+dtos[index-1].getFilm();
		}            
	}
	public void printAll() {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				System.out.println(dtos[index].getAll());
			}
		}
	}
	public boolean deleteByLanguage(String language) {
		for(int index=0;index<dtos.length;index++) {
			if(language==dtos[index].getLanguage()) {
				dtos[index]=null;
				return true;
			}
	}
		return false;
	}
}
