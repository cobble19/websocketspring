package org.springframework.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    @Autowired
    public MyController() {
    }

    @MessageMapping("/action")
    public void handle(SimpMessageHeaderAccessor headerAccessor) {
        System.out.println("Start Controller....");
    }
}