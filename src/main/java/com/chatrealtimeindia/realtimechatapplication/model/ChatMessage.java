package com.chatrealtimeindia.realtimechatapplication.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor

public class ChatMessage {
    private Long id;
    private String sender;
    private String content;
    private LocalDateTime timestamp = LocalDateTime.now();
}
