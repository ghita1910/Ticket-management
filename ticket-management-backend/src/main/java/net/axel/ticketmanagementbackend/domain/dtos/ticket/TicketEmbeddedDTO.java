package net.axel.ticketmanagementbackend.domain.dtos.ticket;

import net.axel.ticketmanagementbackend.domain.enums.ModuleEms;
import net.axel.ticketmanagementbackend.domain.enums.TicketPriority;
import net.axel.ticketmanagementbackend.domain.enums.TicketStatus;

import java.time.Instant;

public record   TicketEmbeddedDTO(
        Long id,
        String description,
        String image,
        TicketStatus status,
        TicketPriority priority,
        ModuleEms module,
        Instant createdAt
) {
}
