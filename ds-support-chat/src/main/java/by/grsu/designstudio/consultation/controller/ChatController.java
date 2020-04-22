package by.grsu.designstudio.consultation.controller;

import by.grsu.designstudio.consultation.domain.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;


@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public Message sendMessage(@RequestParam(name = "content") String content) {
        final String messageId = UUID.randomUUID().toString();

        return new Message(messageId, "dmtr", content);
    }
}