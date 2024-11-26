package com.example.carsapi.controller.rest.mappers;

import com.example.carsapi.controller.rest.models.ReservationResponse;
import com.example.carsapi.services.models.ReservationModel;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ReservationsResponseMapper {

    ReservationResponse toReservationResponse(ReservationModel reservationModel);
}
