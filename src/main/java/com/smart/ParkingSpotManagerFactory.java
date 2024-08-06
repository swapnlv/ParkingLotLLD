package com.smart;

import java.util.Collections;
import java.util.List;

public class ParkingSpotManagerFactory {
    ParkingSpotManager getParkingSpot(VehicleType type, ParkingStrategy parkingStrategy, List<ParkinSpot> parkinSpotList ){
        if(type==VehicleType.TwoWheeler){
            return new TwoWheelerParkingSpotManager(parkinSpotList, parkingStrategy);
        } else if (type==VehicleType.FourWheeler) {
            return new FourWheelerParkingSpotManager(parkinSpotList, parkingStrategy);
        }else{
            return null;
        }
    }
}
