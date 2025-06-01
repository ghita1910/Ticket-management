package net.axel.ticketmanagementbackend.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import net.axel.ticketmanagementbackend.domain.enums.AppRole;
import net.axel.ticketmanagementbackend.domain.enums.UserStatus;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private AppRole role;

    @OneToMany(mappedBy = "client")
    private List<Ticket> createdTickets = new ArrayList<>();

    @OneToMany(mappedBy = "admin")
    private List<Ticket> assignedTickets = new ArrayList<>();

    @OneToMany(mappedBy = "sender")
    private List<Message> messages = new ArrayList<>();
}
