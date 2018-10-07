package com.capgemini.doctors.exceptions;

public class QASException extends Exception
{

	public QASException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QASException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public QASException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public QASException(String message) {
		System.out.println(message);
		// TODO Auto-generated constructor stub
	}

	public QASException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
