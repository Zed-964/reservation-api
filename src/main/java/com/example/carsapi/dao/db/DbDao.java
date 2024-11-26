package com.example.carsapi.dao.db;

import com.example.carsapi.dao.db.models.ReservationEntity;


public interface DbDao {

    int saveReservation(ReservationEntity reservation);

    ReservationEntity findReservation(ReservationEntity reservation);
}
