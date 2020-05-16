package com.company.itb.employee.service;

import com.company.fdn.ndb.CustomNDB;
import com.company.itb.model.Employee;

public class EmployeeRegistrationService {
    private CustomNDB customNDB = new CustomNDB();
    public void registerEmployee(Employee employee){
        customNDB.customStoreInsert(employee);
        System.out.println("Employee "+ employee +"Registered successfully");
    }

}
