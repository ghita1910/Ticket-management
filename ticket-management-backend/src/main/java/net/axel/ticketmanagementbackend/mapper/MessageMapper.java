package net.axel.ticketmanagementbackend.mapper;

import net.axel.ticketmanagementbackend.domain.dtos.message.MessageCreateDTO;
import net.axel.ticketmanagementbackend.domain.dtos.message.MessageResponseDTO;
import net.axel.ticketmanagementbackend.domain.entities.Message;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper extends BaseMapper<Message, MessageCreateDTO, MessageResponseDTO>{
}
