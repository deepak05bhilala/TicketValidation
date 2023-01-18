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
@Document(value = "transaction")
public class TransactionEntity {
    @Id
    private String uuid;

    private BillEntity bill_id;

    private String payment_mode;

    private Date created_at; //set_system date-time

    private Date updated_at; //set_system date-time
}
