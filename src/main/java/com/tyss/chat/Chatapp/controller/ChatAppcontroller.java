package com.tyss.chat.Chatapp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tyss.chat.Chatapp.model.ChatMessage;

@Controller

public class ChatAppcontroller {
	  @MessageMapping("/sendMessage")
	    @SendTo("/topic/messages")
	    public ChatMessage sendMessage(ChatMessage message) {
	        System.out.println("Received: " + message.getContent());
	        return message;
	    }

    @GetMapping("Chat")
    public String Chat() {
        return "hat";
    }
}
