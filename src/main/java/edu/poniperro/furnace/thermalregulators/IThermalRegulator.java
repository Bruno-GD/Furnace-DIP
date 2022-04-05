package edu.poniperro.furnace.thermalregulators;

import edu.poniperro.furnace.heaters.IHeater;
import edu.poniperro.furnace.thermalplaces.IThermalPlace;
import edu.poniperro.furnace.thermalsensors.IThermalSensor;

public interface IThermalRegulator {

    /**
     * @param sensor to get the temperature of place
     * @param heater to increase the temperature at place
     * @param place where the heater & sensor are
     * @param maxTemperature the max. temperature to increase
     * @param minTemperature the min. temperature until next heat cycle
     */
    void regulate(IThermalSensor sensor,
                  IHeater heater,
                  IThermalPlace place,
                  double maxTemperature,
                  double minTemperature);
}
