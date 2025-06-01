package net.axel.ticketmanagementbackend.repository;

import net.axel.ticketmanagementbackend.domain.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {
}
