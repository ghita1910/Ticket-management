package net.axel.ticketmanagementbackend.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import net.axel.ticketmanagementbackend.domain.enums.ModuleEms;
import net.axel.ticketmanagementbackend.domain.enums.TicketPriority;
import net.axel.ticketmanagementbackend.domain.enums.TicketStatus;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "tickets")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String image;

    @Enumerated(EnumType.STRING)
    private TicketStatus status;

    @Enumerated(EnumType.STRING)
    private TicketPriority priority;

    @Enumerated(EnumType.STRING)
    private ModuleEms module;

    private Instant createdAd;

    @ManyToOne
    private AppUser client;

    @ManyToOne
    private AppUser admin;

    @OneToMany(mappedBy = "ticket")
    private List<Message> messages;
}
