package by.grsu.designstudio.consultation.domain;

import java.time.LocalDateTime;

public class Message {

    private String id;
    private String username;
    private String content;
    private LocalDateTime time = LocalDateTime.now();

    public Message() {
    }

    public Message(String id, String username, String content) {
        this.id = id;
        this.username = username;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}