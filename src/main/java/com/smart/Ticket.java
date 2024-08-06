package com.smart;

public class Ticket {

    long entryTime;
    ParkinSpot parkingSpot;
    Vehicle vehicle;

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public ParkinSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkinSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Ticket(long entryTime, ParkinSpot parkingSpot, Vehicle vehicle) {
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;

        ticketDisplay(this.entryTime, this.parkingSpot,this.vehicle);
    }
    public String ticketDisplay(long entryTime, ParkinSpot parkingSpot, Vehicle vehicle){
        return "--------Vehicle No: "+ vehicle.vehicleNo+ "---------\n"
                + "--------Parking Spot no: "+ parkingSpot.spotID+ "---------\n"
                + "--------entry time: "+ entryTime+ "---------\n" ;
    }


}
