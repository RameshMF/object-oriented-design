package com.ramesh.ood.principles.singleresponsibility.good;

public class EmailInfo {
	private String subject;
	private String body;
	private String email;
	public EmailInfo(String subject, String body, String email) {
		super();
		this.subject = subject;
		this.body = body;
		this.email = email;
	}
	// add required fields for advanced mailing...
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
}
