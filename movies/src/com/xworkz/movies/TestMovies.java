package com.xworkz.movies;

import com.xworkz.movies.dao.MoviesDAO;
import com.xworkz.movies.dto.FilmDTO;
import com.xworkz.movies.dto.MoviesDTO;

public class TestMovies {
	public static void main(String[] args) {
		MoviesDTO moviesDTO=new MoviesDTO();
		moviesDTO.setJoner("comedy");
		moviesDTO.setLanguage("hindi");
		moviesDTO.setDuration(2.3f);
		
		MoviesDTO moviesDTO1=new MoviesDTO();
		moviesDTO1.setJoner("horrer");
		moviesDTO1.setLanguage("marathi");
		moviesDTO1.setDuration(2.4f);
		
		FilmDTO dto=new FilmDTO();
		dto.setMovieName("Timepass");
		dto.setHero("DAGADU");
		dto.setHeroine("Prajakta");
		dto.setDirector("Nanapaterakar");
		dto.setBudget(40000000);
		moviesDTO.setFilm(dto);
		
		FilmDTO dto1=new FilmDTO();
		dto1.setMovieName("Shapith");
		dto1.setHeroine("Sakshi");
		dto1.setHero("Aditya");
		dto1.setDirector("UditNarayan");
		dto1.setBudget(60000000);
		moviesDTO1.setFilm(dto1);
		
		System.out.println(moviesDTO.getLanguage());
		System.out.println(dto.getMovieName());
		
		MoviesDAO dao=new MoviesDAO();
		dao.add(moviesDTO);
		dao.add(moviesDTO1);
		
		dao.printAll();
		System.out.println();
		  
		MoviesDTO resp=dao.deletebylanguage("marathi");
		System.out.println(resp);
		dao.printAll();
		
		
	}

}
