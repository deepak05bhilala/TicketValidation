package TicketValidationSystem.InviteYourFriends.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "friends")
public class FriendsEntity {
    @Id
    private String uuid;

    private String first_name;

    private String last_name;

    private UserEntity invited_by;

    private String email;

    private String phone;

    private String qr_url;

    private EventEntity event;

    private Date created_at;   //set_system date-time

    private Date updated_at;   //set_system date-time
}
