package org.tejas.restExample.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


// Error :: MessageBodyWriter not found for media type=application/xml, 
// type=class java.util.ArrayList, genericType=java.util.List<org.tejas.restExample.messenger.model.Message>.
// Solution :: giving some clue to JAX that it is kind of like root element
// so that it can convert it into XML format

@XmlRootElement
public class Message {

	private long id;
	private String message;
	private Date created;
	private String author;
	
	public Message() {
		// always create no-arg constructor when we deal with JSON-XML conversion
	}
	
	public Message(long id, String message, String author) {
		this.id = id;
		this.message = message;
		this.created = new Date();
		this.author = author;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
