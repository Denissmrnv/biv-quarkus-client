package com.example.controller;

import com.api.dto.characteristic.CharacteristicResponseDTO;
import com.example.service.CharacteristicService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;
import java.util.Set;

@Path("/client/")
@Produces(MediaType.APPLICATION_JSON)
public class CharacteristicController {
    @Inject
    @RestClient
    CharacteristicService characteristicService;

    @GET
    @Path("/characteristics")
    public Response  getAllCharacteristics() {
        return characteristicService.getAllCharacteristics();
    }
}
