package net.axel.ticketmanagementbackend.domain.dtos.ticket.responses;

import net.axel.ticketmanagementbackend.domain.dtos.message.MessageEmbeddedDTO;
import net.axel.ticketmanagementbackend.domain.dtos.user.UserEmbeddedDTO;
import net.axel.ticketmanagementbackend.domain.enums.ModuleEms;
import net.axel.ticketmanagementbackend.domain.enums.TicketPriority;
import net.axel.ticketmanagementbackend.domain.enums.TicketStatus;

import java.time.Instant;

public record TicketResponseDTO(
        Long id,
        String description,
        String image,
        TicketStatus status,
        TicketPriority priority,
        ModuleEms module,
        Instant createdAt,
        UserEmbeddedDTO client,
        UserEmbeddedDTO admin,
        MessageEmbeddedDTO messages
) {
}
