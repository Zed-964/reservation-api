package com.example.carsapi.dao.db.models;

import java.time.LocalDate;

public record ReservationEntity(int car_id,

                                LocalDate start_date,

                                LocalDate end_date,

                                float total_price) {
}
