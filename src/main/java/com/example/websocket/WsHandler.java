package com.example.websocket;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@Slf4j
@Component
public class WsHandler extends TextWebSocketHandler {
    private static final CopyOnWriteArraySet<WebSocketSession> users = new CopyOnWriteArraySet();
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 连接成功时候，会触发页面上onopen方法
     */
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        users.add(session);
        System.out.println("connect to the websocket success......当前数量:" + users.size());
    }

    /**
     * 关闭连接时触发
     */
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        log.debug("websocket connection closed......");
        users.remove(session);
    }

    /**
     * js调用websocket.send时候，会调用该方法
     */
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(message.getPayload());
        if ("1".equals(jsonObject.getString("type"))) {
            stringRedisTemplate.opsForValue().set("sport", jsonObject.getString("sportId"));
            stringRedisTemplate.opsForValue().set("isPro", jsonObject.getString("isPro"));
        }
    }

    public static void sendAllMessage(String message) {
        for (WebSocketSession item : users) {
            try {
                item.sendMessage(new TextMessage(message));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
