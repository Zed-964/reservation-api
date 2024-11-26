package com.example.carsapi.controller.rest;

import com.example.carsapi.controller.rest.models.ReservationRequest;
import com.example.carsapi.controller.rest.models.ReservationResponse;
import com.example.carsapi.utils.ReservationsApiConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ReservationsController {

    @Operation(summary = "Post reservation",
                description = "Create reservation on a cars",
                tags = {ReservationsApiConstants.RESERVATIONS_TAG})

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "successful operation",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ReservationResponse.class))),

            @ApiResponse(responseCode = "500",
                    description = "Error occur",
                    content = @Content(mediaType = "application/json")) })

    @PostMapping(value =  ReservationsApiConstants.RESERVATIONS_PATH,
            produces = { "application/json" },
            consumes = { "application/json" })
    ResponseEntity<ReservationResponse> postReservation(@RequestBody ReservationRequest body);
}
