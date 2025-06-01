package net.axel.ticketmanagementbackend.mapper;

public interface BaseMapper<E, Req, Res>{
    E toEntity(Req dto);

    Res toResponseDto(E entity);

    E toEntityFromResponseDto(Res responseDto);
}
