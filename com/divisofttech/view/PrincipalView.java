package com.divisofttech.view;

import com.divisofttech.model.Principal;

public class PrincipalView {

    public void displayPrincipal(Principal principal) {

        if (principal == null) {
            System.out.println("No principal data available.");
            return;
        }

        System.out.println("\n==============================");
        System.out.println("       PRINCIPAL DETAILS");
        System.out.println("==============================");

        System.out.println("Principal ID  : " + principal.getId());
        System.out.println("Name          : " + principal.getName());
        System.out.println("Age           : " + principal.getAge());
        System.out.println("Qualification : " + principal.getQualification());
        System.out.println("Experience    : " + principal.getExperience() + " Years");
    }
}