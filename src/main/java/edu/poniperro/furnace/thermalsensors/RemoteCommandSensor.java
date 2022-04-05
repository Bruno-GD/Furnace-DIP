package edu.poniperro.furnace.thermalsensors;

import edu.poniperro.furnace.thermalplaces.IThermalPlace;

public class RemoteCommandSensor implements IThermalSensor {

    @Override
    public double getCurrentTemperatureOf(IThermalPlace place) {
        return place.getTemperature();
    }
}
