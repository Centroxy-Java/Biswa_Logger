package com.example.demo.UserExcep;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class HaldlingException {
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<?> UserNotFound(UserNotFoundException exception, WebRequest request){
		CustomError e=new CustomError(new Date(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity(e,HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globalException(Exception exception,WebRequest request){
		CustomError e=new CustomError(new Date(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity(e,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ConflictError.class)
	public ResponseEntity<?> conflictException(ConflictError exception,WebRequest request){
		
		CustomError e=new CustomError(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity(e,HttpStatus.CONFLICT);
	}

}
