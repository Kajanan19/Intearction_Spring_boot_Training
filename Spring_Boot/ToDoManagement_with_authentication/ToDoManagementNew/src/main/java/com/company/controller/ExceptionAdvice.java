package com.company.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.company.exception.ServiceException;
import com.company.models.ErrorMessage;

@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<ErrorMessage> mapException(ServiceException serviceException){
		ErrorMessage errorMessage= new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(), serviceException.getMessage());
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
