package com.company.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.company.exception.DataNotFoundException;
import com.company.models.ErrorMessage;

@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<ErrorMessage> mapException(DataNotFoundException dataNotFoundException){
		ErrorMessage errorMessage= new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(), dataNotFoundException.getMessage());
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
