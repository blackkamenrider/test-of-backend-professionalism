package com.hosias.testbackend.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object name) { 
		
	super("Resource not found. "  +name );	
	}
	
}


