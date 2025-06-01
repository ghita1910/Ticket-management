package net.axel.ticketmanagementbackend.repository;

import net.axel.ticketmanagementbackend.domain.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
