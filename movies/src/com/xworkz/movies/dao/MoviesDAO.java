package com.xworkz.movies.dao;

import com.xworkz.movies.dto.MoviesDTO;

public class MoviesDAO {

	MoviesDTO[] dtos=new MoviesDTO[5];
		int index=0;
		public void add(MoviesDTO name) {
			if(index<dtos.length) {
				dtos[index]=name;
				index++;
			}
		}
		
		public MoviesDTO deletebylanguage(String address) {
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
				if(address.equals(dtos[index].getLanguage())){
					dtos[index]=null;
				}
			
				}
			}
			return dtos[index];
		}
		

		public void printAll() {
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
				System.out.println(dtos[index].toString());
				}
			}
		}
		
}
