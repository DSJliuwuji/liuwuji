package io.lwj.jcartadministrationback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administrator")

public class AdministratorController {
    @GetMapping("/login")
    public  String login(){

    }
}
