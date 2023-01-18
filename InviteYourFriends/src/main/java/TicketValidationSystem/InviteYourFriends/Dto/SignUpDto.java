package TicketValidationSystem.InviteYourFriends.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDto {

    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;
    private String password;
}
