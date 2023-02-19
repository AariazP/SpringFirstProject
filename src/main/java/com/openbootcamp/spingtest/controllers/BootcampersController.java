package com.openbootcamp.spingtest.controllers;

import com.openbootcamp.spingtest.models.Bootcamper;
import com.openbootcamp.spingtest.service.BootcamperService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;

@Component
@Path("/")
public class BootcampersController {
   private BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
         this.bootcamperService = bootcamperService;
    }


    @GET
    @Path("/bootcampers")
    public String getBootcampers() {
        return bootcamperService.getBootcampers().toString();
    }

    @POST
    @Path("/bootcampers")
    public Response addBootcamper(Bootcamper bootcamper) {
        bootcamperService.addBootcamper(bootcamper);
        return Response.created(URI.create("/bootcampers/" + bootcamper.getName())).build();
    }
}