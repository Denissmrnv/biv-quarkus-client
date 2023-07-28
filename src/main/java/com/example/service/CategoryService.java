package com.example.service;

import com.api.api.CategoryAPI;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient(configKey = "client")
public interface CategoryService extends CategoryAPI {
}
