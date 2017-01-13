/**
 * 
 */
package com.my.project.exception;


public class DAOException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1526371953950881282L;

	/**
	 * 
	 */
	public DAOException() {
		super();
	}

	/**
	 * @param message exception message
	 * @param cause original exception cause
	 */
	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message exception message
	 */
	public DAOException(String message) {
		super(message);
	}

	/**
	 * @param cause original exception cause
	 */
	public DAOException(Throwable cause) {
		super(cause);
	}

}
