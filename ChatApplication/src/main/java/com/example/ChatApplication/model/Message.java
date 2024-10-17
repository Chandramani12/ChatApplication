package com.example.ChatApplication.model;
import lombok.*;

import java.util.Date;

//@SuppressWarnings("unused")
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//public class Message {
//    private String senderName;
//    private String receiverName;
//    private String message;
//    private String date;
//    private Status status;
//}

public class Message {
    private String senderName;
    private String receiverName;
    private String content;  // This is what you're missing
    private String status;   // Assuming status is a string

    // Getters and Setters
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Message{" +
                "senderName='" + senderName + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", content='" + content + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}