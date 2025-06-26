package com.hexaware.Book.Exception;

public class ApiError {

    int status;
    String error;
    String message;
    String path;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public ApiError() {

	}
	public ApiError(int status, String error, String message, String path) {
		super();
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
	}
	@Override
	public String toString() {
		return "ApiError [status=" + status + ", error=" + error + ", message=" + message + ", path=" + path + "]";
	}
	
	
    
    

   }