package org.tejas.restExample.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.tejas.restExample.messenger.model.Message;
import org.tejas.restExample.messenger.service.MessageService;

//return format is specified here by @Produces annotation
//Others we already know
//"Text_Plain" indicates simple text

@Path("messages")
public class MessageResource {

	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
	// {messageId} --> used for identifying a dynamic parameter
	// @PathParam --> is used to map the parameter to the string messageId
	// writing "long" will automatically convert the string to long
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId")long messageId) {
		return messageService.getMessage(messageId);
	}
	
	
}
