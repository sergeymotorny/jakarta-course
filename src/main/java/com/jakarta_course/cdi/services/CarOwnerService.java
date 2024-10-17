package com.jakarta_course.cdi.services;

import com.jakarta_course.cdi.models.CarOwner;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class CarOwnerService {

    public List<CarOwner> getAllOwners() {
        return List.of(
                new CarOwner("Sergey", 25, "audi", "AO1337BI"),
                new CarOwner("Andrey", 20, "daewoo", "BO2011AA"),
                new CarOwner("Vika", 31, "subaru", "BE4004BI")
        );
    }
}
