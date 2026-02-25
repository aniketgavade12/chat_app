package com.tyss.chat.Chatapp.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;
	public String getContent() {
		// TODO Auto-generated method stub
		return "hi";
	}
}
