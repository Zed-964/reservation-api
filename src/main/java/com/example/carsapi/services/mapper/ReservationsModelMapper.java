package com.example.carsapi.services.mapper;

import com.example.carsapi.dao.db.models.ReservationEntity;
import com.example.carsapi.services.models.ReservationModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ReservationsModelMapper {

    ReservationModel toReservationModel(ReservationEntity entity);

    @Mapping(target = "start_date", source = "startDate")
    @Mapping(target = "end_date", source = "endDate")
    @Mapping(target = "car_id", source = "carId")
    ReservationEntity toReservationEntity(ReservationModel model);
}
