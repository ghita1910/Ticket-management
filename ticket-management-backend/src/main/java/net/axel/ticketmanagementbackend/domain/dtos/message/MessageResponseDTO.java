package net.axel.ticketmanagementbackend.domain.dtos.message;

import net.axel.ticketmanagementbackend.domain.dtos.ticket.TicketEmbeddedDTO;
import net.axel.ticketmanagementbackend.domain.dtos.user.UserEmbeddedDTO;

import java.time.Instant;

public record MessageResponseDTO(
        Long id,
        String content,
        Instant createdAt,
        UserEmbeddedDTO sender,
        TicketEmbeddedDTO ticket
) {
}
