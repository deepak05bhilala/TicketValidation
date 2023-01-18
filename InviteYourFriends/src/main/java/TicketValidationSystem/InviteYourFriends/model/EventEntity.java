package TicketValidationSystem.InviteYourFriends.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "event")
public class EventEntity {
    @Id
    private String uuid;

    private String event;

    private Date created_at;    //set_system date-time

    private Date updated_at;    //set_system date-time

}
