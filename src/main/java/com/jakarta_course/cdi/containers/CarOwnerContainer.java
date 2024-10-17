package com.jakarta_course.cdi.containers;

import com.jakarta_course.cdi.models.CarOwner;
import com.jakarta_course.cdi.services.CarOwnerService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Named
@SessionScoped
public class CarOwnerContainer implements Serializable {

    @Inject
    private CarOwnerService carOwnerService;

    private List<CarOwner> carOwners;

    private CarOwner newOwner = new CarOwner();

    @PostConstruct
    public void init() {
        carOwners = new ArrayList<>(carOwnerService.getAllOwners());
    }

    public void addOwner() {
        carOwners.add(newOwner);
        newOwner = new CarOwner();
    }
}
