package com.example.carsapi.dao.db.impl;

import com.example.carsapi.dao.db.DbDao;
import com.example.carsapi.dao.db.models.ReservationEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class DbDaoImpl implements DbDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public int saveReservation(ReservationEntity reservation) {
        String sql = """
            INSERT INTO reservations (car_id, start_date, end_date, total_price)
            VALUES (?, ?, ?, 0);
        """;

        return jdbcTemplate.update(sql,
                reservation.car_id(), reservation.start_date(), reservation.end_date());
    }

    @Override
    public ReservationEntity findReservation(ReservationEntity reservation) {
        return null;
    }
}
