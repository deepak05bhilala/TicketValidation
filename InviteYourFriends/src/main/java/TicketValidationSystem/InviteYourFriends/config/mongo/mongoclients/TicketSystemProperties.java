package TicketValidationSystem.InviteYourFriends.config.mongo.mongoclients;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Data
@Configuration
@ConfigurationProperties(prefix = "ticket-validation")
public class TicketSystemProperties {
    private String mongoUrl;
    private String ticketValidationDb;
}
