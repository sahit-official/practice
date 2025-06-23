package com.tryGit.fieldService.exception;

public class EntityNotFoundException extends RuntimeException{

	public EntityNotFoundException(String message) {
		super(message);
	}
}
