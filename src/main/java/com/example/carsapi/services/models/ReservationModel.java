package com.example.carsapi.services.models;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class ReservationModel {

    private int carId;

    private LocalDate startDate;

    private LocalDate endDate;
}
