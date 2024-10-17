package com.jakarta_course.cdi.controllers;

import jakarta.mvc.Controller;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/carOwner")
@Controller
public class CarOwnerController {

    @GET
    public String getCarOwners() {
        return "jsf/carOwner.jsp";
    }
}
