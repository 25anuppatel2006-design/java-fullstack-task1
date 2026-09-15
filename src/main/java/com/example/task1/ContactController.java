package com.example.task1;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {

    @PostMapping("/contact")
    public String submitContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        System.out.println("========== CONTACT FORM ==========");
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
        System.out.println("Message : " + message);
        System.out.println("==================================");

        return "Message submitted successfully!";
    }
}