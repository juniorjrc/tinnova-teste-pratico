package br.com.tinnova.testepratico.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date timestamp;
	private String message;
	private String details;
	private String cause;

	public ExceptionResponse(Date timestamp, String message, String details, String cause) {
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.cause = cause;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

}
