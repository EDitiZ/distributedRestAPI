package com.example.chatapp.Controller;

import com.example.chatapp.Pojo.Message;
import com.example.chatapp.Pojo.Rooms;
import com.example.chatapp.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/room")
@CrossOrigin(origins = "*")
public class RoomController {

    @Autowired
    RoomRepository roomRepository;

    @PostMapping
    public ResponseEntity<Rooms> saveMessage(@RequestBody Rooms rooms) {

        String username = rooms.getUsername();
        String room = rooms.getRoom();

        Rooms newRoom = new Rooms(username, room);
        roomRepository.save(newRoom);
        return new ResponseEntity<>(newRoom, HttpStatus.CREATED);

    }
}
