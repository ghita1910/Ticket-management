package net.axel.ticketmanagementbackend.mapper;

import net.axel.ticketmanagementbackend.domain.dtos.ticket.requests.TicketCreateDTO;
import net.axel.ticketmanagementbackend.domain.dtos.ticket.responses.TicketResponseDTO;
import net.axel.ticketmanagementbackend.domain.entities.Ticket;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TicketMapper extends BaseMapper<Ticket, TicketCreateDTO, TicketResponseDTO>{
}
