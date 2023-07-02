package com.example.chatapp.Controller;

import com.example.chatapp.Pojo.Message;
import com.example.chatapp.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
@RequestMapping("/api/messages")
@CrossOrigin(origins = "*")

public class MessageController {

    @Autowired
    MessageRepository messageRepository;

    @PostMapping
    public ResponseEntity<Message> saveMessage(@RequestBody Message message) {
        String room = message.getRoom();
        String author = message.getAuthor();
        String content = message.getMessage();
        String time = message.getTime();

        Message msg = new Message(room,author,content,time);
        messageRepository.save(msg);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);

    }

    @GetMapping
    @ResponseBody
    public String getMessage() {
        return "Working...";
    }
}
