package com.smart;

import java.util.List;

public class EntranceGate {


    ParkingSpotManagerFactory parkingSpotManagerFactory;
    ParkinSpot parkinSpot;




    public EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }


    public ParkinSpot findParkingSpot(VehicleType type, ParkingStrategy parkingStrategy, List<ParkinSpot> list){

        return parkingSpotManagerFactory.getParkingSpot(type, parkingStrategy, list).findParkingSpot();
    }

    public Ticket generateTicket(long entryTime, ParkinSpot parkingSpot, Vehicle vehicle){
            return new Ticket(entryTime, parkingSpot, vehicle);
    }


    public ParkinSpot updateSpot(ParkinSpot spot){

        spot.isEmpty=false;

        return  spot;

    }

}
