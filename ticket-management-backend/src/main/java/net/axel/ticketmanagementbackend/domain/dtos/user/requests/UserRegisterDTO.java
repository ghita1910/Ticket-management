package net.axel.ticketmanagementbackend.domain.dtos.user.requests;

import jakarta.validation.constraints.NotBlank;

public record UserRegisterDTO(
        @NotBlank String name,
        @NotBlank String email,
        @NotBlank String password
) {
}
