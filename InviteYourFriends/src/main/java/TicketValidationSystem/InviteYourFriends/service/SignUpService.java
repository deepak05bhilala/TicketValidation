package TicketValidationSystem.InviteYourFriends.service;

import TicketValidationSystem.InviteYourFriends.Dto.SignUpDto;
import org.springframework.http.ResponseEntity;

public interface SignUpService {
    public ResponseEntity<?> addNewUser(SignUpDto signUpDto);
}
