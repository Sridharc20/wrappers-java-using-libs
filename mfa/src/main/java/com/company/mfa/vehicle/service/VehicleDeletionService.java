package com.company.mfa.vehicle.service;

import com.company.fdn.ndb.CustomNDB;
import com.company.mfa.vehicle.model.Vehicle;

public class VehicleDeletionService {

    private CustomNDB customNDB = new CustomNDB();

    public void unRegisterVehicle(Vehicle vehicle){

        this.customNDB.customStoreDelete(vehicle);

        System.out.println("Vehicle De-register Successful.");
    }
}
