package edu.poniperro.furnace.thermalsensors;

import edu.poniperro.furnace.thermalplaces.IThermalPlace;

public interface IThermalSensor {

    /**
     * @param place to get the current temperature of
     * @return the current temperature at place
     */
    double getCurrentTemperatureOf(IThermalPlace place);
}
