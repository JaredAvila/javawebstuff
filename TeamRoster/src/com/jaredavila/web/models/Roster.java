package com.jaredavila.web.models;

import java.util.ArrayList;

public class Roster {
	
	
	//member vaiables -------------------------------------------------------------------------------------------------------------------------------------------
	
	private ArrayList<Object> teams = new ArrayList<Object>();
	
	
	//constructors ----------------------------------------------------------------------------------------------------------------------------------------------
	
	public Roster(ArrayList<Object> teams) {
		this.teams = teams;
	}
	
	
	//gets and sets ---------------------------------------------------------------------------------------------------------------------------------------------
	
	public ArrayList<Object> getRoster(){
		return this.teams;
	}
	public void setRoster(ArrayList<Object> teams){
		this.teams = teams;
	}
}
