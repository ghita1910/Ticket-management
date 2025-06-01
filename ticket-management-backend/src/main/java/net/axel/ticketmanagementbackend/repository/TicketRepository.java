package net.axel.ticketmanagementbackend.repository;

import net.axel.ticketmanagementbackend.domain.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
