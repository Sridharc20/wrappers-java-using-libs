package com.company.mfa;

import com.company.mfa.vehicle.model.Vehicle;
import com.company.mfa.vehicle.service.VehicleDeletionService;
import com.company.mfa.vehicle.service.VehicleRegistrationService;

public class VehicleTest {

    public static void main(String[] agrs){

        VehicleRegistrationService vehicleRegistrationService = new VehicleRegistrationService();
        VehicleDeletionService vehicleDeletionService = new VehicleDeletionService();


        vehicleRegistrationService.registerVehicle(new Vehicle("Maruthi", "Petrol"));
        vehicleRegistrationService.registerVehicle(new Vehicle("Hyundai", "Diesel"));



        vehicleDeletionService.unRegisterVehicle(new Vehicle("Honda", "Petrol"));
    }
}
