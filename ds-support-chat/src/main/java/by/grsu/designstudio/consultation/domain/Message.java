package by.grsu.designstudio.consultation.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy ");

    private String id;
    private String username;
    private String content;
    private String time;

    public Message() {
    }

    public Message(String id, String username, String content) {
        this.id = id;
        this.username = username;
        this.content = content;
        this.time = LocalDateTime.now().format(FORMATTER);
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}