package TicketValidationSystem.InviteYourFriends.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "User")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 5170488551424647252L;

    @Id
    private String uuid;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    @Indexed(unique = true)
    private String email;

    @Indexed
    private String phone;

    @CreatedDate
    private LocalDateTime created_at;  //set_system date-time

    @LastModifiedDate
    private LocalDateTime updated_at;  //set_system date-time

    private String unique_password;

}
