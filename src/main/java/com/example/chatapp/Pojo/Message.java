package com.example.chatapp.Pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String room;
    private String author;
    private String message;
    private String time;

    public Message(){

    }

    public Message(String room, String author, String message, String time) {
        this.room = room;
        this.author = author;
        this.message = message;
        this.time = time;
    }

    public String getRoom() {
        return room;
    }

    public String getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }
}
