package TicketValidationSystem.InviteYourFriends.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ticket_validation")
public class HomePageController {

    @GetMapping("/home")
    @ResponseBody
    public String getHomePage(){
        return "Welcome to Home Page";
    }

}
