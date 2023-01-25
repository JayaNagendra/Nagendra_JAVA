package exception;

import java.sql.Date;

public class ErrorDetail {
	
	// creating instance variable
	private Date timestamp;
	 
	private String message;
	
	private  String details;

	//getter & setter
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public ErrorDetail(java.util.Date date, String message, String details) {
		super();
		this.timestamp = (Date) date;
		this.message = message;
		this.details = details;
	}

	
	}


