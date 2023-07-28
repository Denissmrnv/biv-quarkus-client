package com.example.controller;

import com.api.dto.product.ProductResponseDTO;
import com.example.service.ProductService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path("/client/")
@Produces(MediaType.APPLICATION_JSON)
public class ProductController {

    @Inject
    @RestClient
    ProductService productService;

    @GET
    @Path("/products")
    public Response getAllProducts() {

        return (Response) productService.getAllProducts();
    }

//    @GET
//    @Path("/products/{id}")
//    public ProductResponseDTO getProductById(@PathParam("id") Long id) {
//        return productService.getProductById(id);
//    }
}
