package web.com.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;
import web.com.chat.vo.ChatMessage;

@Controller
@Slf4j
public class ChatController {
	
	@MessageMapping("/chat.sendMessage")
	@SendTo("/topic/public")
	public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
		log.debug("chatMessage =========> {}", chatMessage.toString());
		return chatMessage;
	}
	
	@MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
	public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
		
		log.debug("chatMessage =========> {}", chatMessage.toString());
		return chatMessage;
	}
}
