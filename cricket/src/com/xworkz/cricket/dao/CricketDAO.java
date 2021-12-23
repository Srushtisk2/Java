package com.xworkz.cricket.dao;

import com.xworkz.cricket.dto.Cricketdetails;



public class CricketDAO 
{

	
		
		Cricketdetails []dtos = new Cricketdetails [5];
		int index = 0;
		public String insert(Cricketdetails dto)
	    {
		
		if(dto==null) {
			return "this is null object";
		}   
			else
			{
				dtos[index] = dto;
				System.out.println(dtos[index].getType());
				index++;
				return "object added with the company name "+ dtos[index-1].getType();
			}
		}
		public void printAll() {
			for(int index =0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
			
					System.out.println(dtos[index].getAll());

				}
					
				}
		}


	public boolean deleteByteams(int teams) {
		for(int index = 0;index<dtos.length;index++){
			dtos[index]=null;
			return true;
		}

	return false;
	}
	public Cricketdetails updateTypeByTeams(String type,int teams) {
		Cricketdetails dto = null;
		for(int index = 0; index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(dtos[index].getType().equals(type)) {
					dtos[index].setTeams(teams);
					dtos[index]=null;
					return dtos[index];
				}
			}
		}
	return dto;
	}
	public Cricketdetails updatManagerByType(String manager,String type) {
		Cricketdetails dto = null;
		for(int index = 0; index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(dtos[index].getManager().equals(manager)) {
					dtos[index].setType(type);
					dtos[index]=null;
					dto=dtos[index];
				}
			}
		}
	return dto;
	}
	public Cricketdetails updatTypeByTeams(String type,int teams) {
		Cricketdetails dto = null;
		for(int index = 0; index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(dtos[index].getType().equals(type)) {
					dtos[index].setTeams(teams);
					dtos[index]=null;
					dto=dtos[index];
				}
			}
		}
	return dto;
	}

	public boolean deleteByTeams(int teams) {
		for(int index = 0; index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(teams==(dtos[index].getTeams())) {
					dtos[index]=null;
					return true;
				}
			}
		}
	return false;
	}

	public boolean deleteByType(String type) {
		for(int index = 0; index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(type==(dtos[index].getType())) {
					dtos[index]=null;
					return true;
				}
			}
		}
	return false;
	}
	public boolean deleteByManager(String manager) {
		for(int index = 0; index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(manager==dtos[index].getManager()) {
					dtos[index]=null;
					return true;
				}
			}
		}
	return false;
	}

	public Cricketdetails getByTeams(int teams) {
		for(int index = 0; index<dtos.length;index++) {
		if(dtos[index]!=null) {
				if(teams==dtos[index].getTeams()) {
					dtos[index]=null;
					return dtos[index];
				}
			}
		}
	return null;
	}

	public Cricketdetails getByTname(String tname) {
		for(int index = 0; index<dtos.length;index++) {
				if(tname==dtos[index].getName().getTname()) {
					return dtos[index];
				}
			}
	return null;
	}

	public Cricketdetails getByCaptain(String type) {
		for(int index = 0; index<dtos.length;index++) {
				if(type==dtos[index].getType()) {
					return dtos[index];
					
				}

		}
		return null;
	}
	}

				
			


	
	








