package net.axel.ticketmanagementbackend.domain.dtos.message;

import java.time.Instant;

public record MessageEmbeddedDTO(
        Long id,
        String content,
        Instant timestamp
) {
}
