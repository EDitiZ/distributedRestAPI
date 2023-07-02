package com.example.chatapp.Pojo;

import jakarta.persistence.*;

@Entity
public class Rooms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "created_by")
    private String username;
    private String room;

    public Rooms() {
    }

    public Rooms(String username, String room) {
        this.username = username;
        this.room = room;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getRoom() {
        return room;
    }
}
