package com.divisoftech.controller;

import com.divisoftech.model.Principal;

public class PrincipalController {

    private Principal principal;

    
    public void createPrincipal(Principal principal) {
        this.principal = principal;
        System.out.println("Principal created successfully.");
    }

    
    public Principal getPrincipal() {
        return principal;
    }

    public void updatePrincipal(String name, int age, String qualification, int experience) {
        if (principal != null) {
            principal.setName(name);
            principal.setAge(age);
            principal.setQualification(qualification);
            principal.setExperience(experience);

            System.out.println("Principal updated successfully.");
        }
    }

    
    public void deletePrincipal() {
        principal = null;
        System.out.println("Principal deleted successfully.");
    }
}