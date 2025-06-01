package net.axel.ticketmanagementbackend.service;

import net.axel.ticketmanagementbackend.domain.dtos.user.responses.UserResponseDTO;

import java.util.List;

public interface UserService {

    UserResponseDTO findById(Long id);
    List<UserResponseDTO> findAllUsers(int page, int size);
}
