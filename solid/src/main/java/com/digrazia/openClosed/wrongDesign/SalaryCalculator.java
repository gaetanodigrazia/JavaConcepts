package com.digrazia.openClosed.wrongDesign;

public class SalaryCalculator {
    public double calculateSalary(String role) {
        if (role.equals("Manager")) {
            return 5000;
        } else if (role.equals("Developer")) {
            return 3000;
        } else {
            return 2000;
        }
    }

}
