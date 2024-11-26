package com.example.carsapi.controller.rest.models;

import com.example.carsapi.services.models.ReservationModel;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ReservationResponse {
    private ReservationModel data;
}
