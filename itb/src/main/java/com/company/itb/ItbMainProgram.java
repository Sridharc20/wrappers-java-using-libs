package com.company.itb;


import com.company.itb.employee.service.EmployeeDeletionService;
import com.company.itb.employee.service.EmployeeRegistrationService;
import com.company.itb.model.Employee;

public class ItbMainProgram {
    public static void main(String[] args){
    EmployeeRegistrationService employeeRegistrationService = new EmployeeRegistrationService();
    employeeRegistrationService.registerEmployee(new Employee("sridhar","DevOps"));
    employeeRegistrationService.registerEmployee(new Employee("Venu","Engineering"));

    EmployeeDeletionService employeeDeletionService = new EmployeeDeletionService();
    employeeDeletionService.deleteEmployee(new Employee("sridhar","DevOps"));

    }
}
