package edu.poniperro.furnace.heaters;

import edu.poniperro.furnace.thermalplaces.IThermalPlace;

public interface IHeater {

    /**
     * @param place to increase the temperature by the Heater
     *              every update tick
     */
    void increaseTemperatureOf(IThermalPlace place);
}
