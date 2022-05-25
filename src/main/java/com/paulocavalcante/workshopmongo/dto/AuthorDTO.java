package com.paulocavalcante.workshopmongo.dto;

import java.io.Serializable;

import com.paulocavalcante.workshopmongo.domain.User;

public class AuthorDTO implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	
	
	public AuthorDTO(){ 
	}
	
	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}

}
