package com.smart;

import java.util.List;

public abstract class ParkingStrategy {

    public abstract ParkinSpot findSpot(List<ParkinSpot> spots);
}
