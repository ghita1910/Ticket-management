package net.axel.ticketmanagementbackend.domain.dtos.user;

import net.axel.ticketmanagementbackend.domain.enums.AppRole;
import net.axel.ticketmanagementbackend.domain.enums.UserStatus;

public record UserEmbeddedDTO(
        Long id,
        String name,
        String email,
        AppRole role
) {
}
