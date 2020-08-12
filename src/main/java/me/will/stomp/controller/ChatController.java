package me.will.stomp.controller;

import me.will.stomp.dto.MessageDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

	@MessageMapping("/hello")
	@SendTo("/topic/roomId")
	public MessageDto broadCast(MessageDto messageDto) {
		return messageDto;
	}

}
