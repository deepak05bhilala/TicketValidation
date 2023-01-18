package TicketValidationSystem.InviteYourFriends.config.mongo;


import TicketValidationSystem.InviteYourFriends.config.mongo.mongoclients.TicketSystemProperties;
import TicketValidationSystem.InviteYourFriends.config.mongo.mongoclients.TicketValidationClient;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

public class MongoConfig {

    @Autowired
    TicketSystemProperties ticketSystemProperties;

    public MongoClient mongo(String connectionUrl) {
        ConnectionString connectionString = new ConnectionString(connectionUrl);
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }

    @Bean
    public TicketValidationClient getTicketValidationClient(){
        TicketValidationClient ticketValidationClient = new TicketValidationClient();
        ticketValidationClient.setMongoTemplate(new MongoTemplate(mongo(ticketSystemProperties.getMongoUrl()), ticketSystemProperties.getTicketValidationDb()));
        return ticketValidationClient;
    }
}
