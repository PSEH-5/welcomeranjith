package com.ps.ranjith.app.exceptions;

/**
 * @author indiahiring
 *
 */
public class CustomGameException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomGameException(String exceptionMsg, Throwable exception) {
		super(exceptionMsg, exception);
	}

}
