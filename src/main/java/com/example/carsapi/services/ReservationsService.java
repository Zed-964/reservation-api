package com.example.carsapi.services;

import com.example.carsapi.dao.db.DbDao;
import com.example.carsapi.dao.db.models.ReservationEntity;
import com.example.carsapi.services.mapper.ReservationsModelMapper;
import com.example.carsapi.services.models.ReservationModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ReservationsService {

    private final DbDao dbDao;

    private final ReservationsModelMapper reservationsModelMapper;

    public ReservationModel createReservation(ReservationModel reservationModel) {
        ReservationEntity entity = reservationsModelMapper.toReservationEntity(reservationModel);

        dbDao.saveReservation(entity);

        return reservationsModelMapper.toReservationModel(dbDao.findReservation(entity));
    }
}
