package TicketValidationSystem.InviteYourFriends.model;


import TicketValidationSystem.InviteYourFriends.Enums.Bill.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "Bill")
public class BillEntity {
    @Id
    private String uuid;

    private UserEntity user_id;

    private Double amount_without_tax;

    private Double invitation_card_charges;

    private Double delivery__charges;

    private Double total_amount;

    private EventEntity event_type;

    @Field
    private String payment_status = String.valueOf(PaymentStatus.PENDING);

    private Date created_at;     //set_system date-time

    private Date updated_at;     //set_system date-time

}
