package com.jakarta_course.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.application.NavigationHandler;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Named
@RequestScoped
public class AuthBean {

    @Size(min = 3, max = 35, message = "The size must be from 3 to 35 characters!")
    private String password;

    @Size(min = 3, max = 35, message = "The size must be from 3 to 35 characters!")
    private String username;
    private boolean authenticated;

    public String login() {

        if ("adm".equals(username) && "adm".equals(password)) {
            authenticated = true;
            return "home";
        } else {
            authenticated = false;
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Invalid login or password!", null);
            FacesContext.getCurrentInstance().addMessage(null, message);
            return "auth?error=true";
        }
    }

    public String logout() {
        authenticated = false;
        return "auth?faces-redirect=true";
    }

    public void checkAuthenticated() {
        if (!authenticated) {
            FacesContext context = FacesContext.getCurrentInstance();
            NavigationHandler handler = context.getApplication().getNavigationHandler();
            handler.handleNavigation(context, null, "auth?faces-redirect=true");
        }
    }
}
