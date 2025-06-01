package net.axel.ticketmanagementbackend.domain.dtos.message;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record MessageCreateDTO(
        @NotBlank String content,
        @NotNull Long senderId,
        @NotNull Long ticketId
) {
}
