package com.example.controller;

import com.api.dto.category.CategoryResponseDTO;
import com.example.service.CategoryService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;


@Path("/client/")
@Produces(MediaType.APPLICATION_JSON)
public class CategoryController {
    @Inject
    @RestClient
    CategoryService categoryService;

    @GET
    @Path("/categories")
    public Response getAllCategories() {
        return categoryService.getAllCategories();
    }
}
