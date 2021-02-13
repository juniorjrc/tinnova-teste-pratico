package br.com.tinnova.testepratico.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import br.com.tinnova.testepratico.exception.ExceptionResponse;
import br.com.tinnova.testepratico.exception.FalhaTransacaoException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler {

	@ExceptionHandler(FalhaTransacaoException.class)
	public final ResponseEntity<ExceptionResponse> handleBadRequestException(Exception ex, WebRequest request) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(
				new Date(), 
				ex.getMessage(),
				request.getDescription(false),
				ex.getCause().getMessage());

		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
