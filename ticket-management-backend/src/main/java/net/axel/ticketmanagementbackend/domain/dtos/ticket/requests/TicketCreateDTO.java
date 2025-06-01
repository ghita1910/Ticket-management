package net.axel.ticketmanagementbackend.domain.dtos.ticket.requests;

import jakarta.validation.constraints.NotNull;
import net.axel.ticketmanagementbackend.domain.enums.ModuleEms;

public record TicketCreateDTO(
        String description,
        String image,
        ModuleEms module,

        @NotNull Long clientId
) {
}
