package com.app.validations.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.validations.exception.UserRecordNotFindException;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(UserRecordNotFindException.class)
	public ResponseEntity<String> userRecordNotFound(UserRecordNotFindException urne) {
		
		return new ResponseEntity<String>(urne.getMessage(), HttpStatus.NOT_FOUND);
		
	}
}
