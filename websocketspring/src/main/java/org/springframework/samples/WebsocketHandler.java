package org.springframework.samples;

import java.util.Date;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class WebsocketHandler extends TextWebSocketHandler {
	
	@Override
    protected void handleTextMessage(WebSocketSession session,TextMessage message) throws Exception {
        super.handleTextMessage(session, message);
        System.out.println("Server received from client: " + message.getPayload());
        TextMessage returnMessage = new TextMessage(message.getPayload());
        for (int i = 0; i < 10; i++) {
        	returnMessage = new TextMessage(message.getPayload() + ", i = " + i + ", date: " + new Date());
            session.sendMessage(returnMessage);
            Thread.sleep(1000);
        }
    }
}
