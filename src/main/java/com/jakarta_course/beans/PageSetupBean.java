package com.jakarta_course.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Named
@RequestScoped
public class PageSetupBean implements Serializable {

    public String goToIndex() {
        return "index";
    }

    public String goToAuth() {
        return "auth?faces-redirect=true";
    }
}
