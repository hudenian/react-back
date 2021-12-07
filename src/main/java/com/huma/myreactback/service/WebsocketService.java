package com.huma.myreactback.service;

import com.huma.myreactback.enums.WebsocketEnums;
import com.huma.myreactback.websocket.controller.MessageBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Administrator
 */
@Slf4j
@Service
public class WebsocketService {

    @Resource
    private SimpMessagingTemplate messagingTemplate;

    public String send(MessageBean msg) {

        log.info("get req msg: {}", msg);

        String message = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now())
                + " 收到一条消息: " + msg.toString();

        messagingTemplate.convertAndSend(WebsocketEnums.WEBSOCKET_DESTINATION.getTopic(), msg);

        return message;

    }

}
