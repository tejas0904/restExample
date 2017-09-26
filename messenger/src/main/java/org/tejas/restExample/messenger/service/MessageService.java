package org.tejas.restExample.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.tejas.restExample.messenger.model.Message;

public class MessageService {

	public List<Message>getAllMessages(){
		Message m1 = new Message(1L,"Hey","Tejas");
		Message m2 = new Message(2L,"Hello","Karan");
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
	}
	
}
