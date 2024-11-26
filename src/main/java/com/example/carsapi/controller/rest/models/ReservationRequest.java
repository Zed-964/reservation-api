package com.example.carsapi.controller.rest.models;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class ReservationRequest {

    private int carId;

    private LocalDate startDate;

    private LocalDate endDate;
}
