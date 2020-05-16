package com.company.itb.employee.service;

import com.company.fdn.ndb.CustomNDB;
import com.company.itb.model.Employee;

public class EmployeeDeletionService {
    private CustomNDB customNDB = new CustomNDB();
    public void deleteEmployee(Employee employee){
        customNDB.customStoreDelete(employee);
        System.out.println("Employee "+ employee +"Deleted successfully");
    }
}
