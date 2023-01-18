package TicketValidationSystem.InviteYourFriends.serviceImpl;

import TicketValidationSystem.InviteYourFriends.Dto.SignUpDto;
import TicketValidationSystem.InviteYourFriends.Pojo.UserPojo;
import TicketValidationSystem.InviteYourFriends.service.SignUpService;
import TicketValidationSystem.InviteYourFriends.utils.EncryptionClass;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    ObjectMapper objectMapper;
    @Override
    public ResponseEntity<?> addNewUser(SignUpDto signUpDto) {
        try{
//                UserPojo userPojo = objectMapper.convertValue(signUpDto, UserPojo.class);
            UserPojo userPojo  = new UserPojo();
            userPojo.setEmail(signUpDto.getEmail());
            userPojo.setPhone(signUpDto.getPhone_number());
            userPojo.setFirstName(signUpDto.getFirst_name());
            userPojo.setLastName(signUpDto.getLast_name());
            userPojo.setUnique_password(EncryptionClass.encryptString(signUpDto.getPassword()));


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
