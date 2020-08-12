package me.will.stomp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class MessageDto {

	private String userName;

	private String content;

	private LocalDateTime dateTime;

	public MessageDto(String userName, String content, LocalDateTime dateTime) {
		this.userName = userName;
		this.content = content;
		this.dateTime = dateTime;
	}

}
