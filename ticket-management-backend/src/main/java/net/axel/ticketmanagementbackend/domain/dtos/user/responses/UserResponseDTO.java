package net.axel.ticketmanagementbackend.domain.dtos.user.responses;

import net.axel.ticketmanagementbackend.domain.dtos.message.MessageEmbeddedDTO;
import net.axel.ticketmanagementbackend.domain.dtos.ticket.TicketEmbeddedDTO;
import net.axel.ticketmanagementbackend.domain.enums.AppRole;
import net.axel.ticketmanagementbackend.domain.enums.UserStatus;

import java.util.List;

public record UserResponseDTO(
        Long id,
        String name,
        String email,
        AppRole role,
        List<TicketEmbeddedDTO> createdTickets,
        List<TicketEmbeddedDTO> assignedTickets,
        List<MessageEmbeddedDTO> messages
) {
}
