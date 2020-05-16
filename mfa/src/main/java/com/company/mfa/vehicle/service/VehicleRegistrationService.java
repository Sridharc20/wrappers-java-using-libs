package com.company.mfa.vehicle.service;

import com.company.fdn.ebus.CustomEventBus;
import com.company.fdn.ndb.CustomNDB;
import com.company.mfa.vehicle.model.Vehicle;

public class VehicleRegistrationService {

    private CustomNDB customNDB = new CustomNDB();
    private CustomEventBus customEventBus = new CustomEventBus();

    public void registerVehicle(Vehicle vehicle){

        this.customNDB.customStoreInsert(vehicle);
        this.customEventBus.publishEvent(vehicle);

        System.out.println("Vehicle Registration Successful.");
    }
}
