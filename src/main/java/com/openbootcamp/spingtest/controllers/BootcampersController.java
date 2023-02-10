package com.openbootcamp.spingtest.controllers;

import com.openbootcamp.spingtest.service.BootcamperService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.stereotype.Component;

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
}