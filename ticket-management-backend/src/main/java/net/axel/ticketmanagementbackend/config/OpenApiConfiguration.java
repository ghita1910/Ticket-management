package net.axel.ticketmanagementbackend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfiguration   {

    @Bean
    public OpenAPI defineOpenApi() {
        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("Development");

        Contact myContact = new Contact();
        myContact.setName("ghita");
        myContact.setEmail("g.brahimi@ac.esisa.ma");

        Info information = new Info()
                .title("Ticket Management System API")
                .version("1.0")
                .description("This API exposes endpoints to manage tickets report.")
                .contact(myContact);
        return new OpenAPI().info(information).servers(List.of(server));
    }
}
