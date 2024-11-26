package com.example.carsapi.controller.rest.mappers;

import com.example.carsapi.controller.rest.models.ReservationRequest;
import com.example.carsapi.services.models.ReservationModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReservationRequestMapper {
    ReservationModel toReservationsModel(ReservationRequest reservationRequest);
}
