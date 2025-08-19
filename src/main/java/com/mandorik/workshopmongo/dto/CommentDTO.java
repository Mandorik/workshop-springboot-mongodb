package com.mandorik.workshopmongo.dto;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String text;
	@JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant date;
	private AuthorDTO AuthorDTO;
	
	public CommentDTO() {
		
	}

	public CommentDTO(String text, Instant date, com.mandorik.workshopmongo.dto.AuthorDTO authorDTO) {
		super();
		this.text = text;
		this.date = date;
		AuthorDTO = authorDTO;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public AuthorDTO getAuthorDTO() {
		return AuthorDTO;
	}

	public void setAuthorDTO(AuthorDTO authorDTO) {
		AuthorDTO = authorDTO;
	}
	
}
