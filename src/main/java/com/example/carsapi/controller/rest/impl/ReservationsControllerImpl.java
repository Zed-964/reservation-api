package com.example.carsapi.controller.rest.impl;

import com.example.carsapi.controller.rest.ReservationsController;
import com.example.carsapi.controller.rest.mappers.ReservationRequestMapper;
import com.example.carsapi.controller.rest.mappers.ReservationsResponseMapper;
import com.example.carsapi.controller.rest.models.ReservationRequest;
import com.example.carsapi.controller.rest.models.ReservationResponse;
import com.example.carsapi.services.ReservationsService;
import com.example.carsapi.utils.ReservationsApiConstants;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@Tag(name = ReservationsApiConstants.RESERVATIONS_TAG, description = "Reserve a card")
public class ReservationsControllerImpl implements ReservationsController {

    private final ReservationsService reservationsService;

    private final ReservationsResponseMapper reservationsResponseMapper;

    private final ReservationRequestMapper reservationRequestMapper;

    @Override
    public ResponseEntity<ReservationResponse> postReservation(ReservationRequest body) {
        if (body.getStartDate().isAfter(body.getEndDate())) {
            ResponseEntity.badRequest().body("La date de début ne doit pas être supérieur à la date de fin !");
        }

        return ResponseEntity.ok().body(reservationsResponseMapper.toReservationResponse(reservationsService.createReservation(reservationRequestMapper.toReservationsModel(body))));
    }
}
