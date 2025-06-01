package net.axel.ticketmanagementbackend.domain.dtos.user.requests;

import jakarta.validation.constraints.NotBlank;

public record UserLoginDTO(
        @NotBlank String email,
        @NotBlank String password
) {
}
