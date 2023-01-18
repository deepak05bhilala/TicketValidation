package TicketValidationSystem.InviteYourFriends.controller;

import TicketValidationSystem.InviteYourFriends.Dto.SignUpDto;
import TicketValidationSystem.InviteYourFriends.service.SignUpService;
import TicketValidationSystem.InviteYourFriends.serviceImpl.SignUpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/api/v1/ticket_validation")
public class LoginOrSignUpController {

    @Autowired
    SignUpService signUpSerivce;

    @PostMapping("/sign_up")
    public ResponseEntity<?> signUpApi(@RequestBody SignUpDto signUpDto){

        return new ResponseEntity<>(signUpSerivce.addNewUser(signUpDto), HttpStatus.OK);
    }



}
