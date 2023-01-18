package TicketValidationSystem.InviteYourFriends.config.mongo.mongoclients;


import lombok.Data;
import org.springframework.data.mongodb.core.MongoTemplate;

@Data
public class TicketValidationClient {
    private MongoTemplate mongoTemplate;
}

