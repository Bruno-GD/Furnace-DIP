package edu.poniperro.furnace.heaters;

import edu.poniperro.furnace.thermalplaces.IThermalPlace;

public class GasHeater implements IHeater {
    private final double increasePerTick = 2d;

    @Override
    public void increaseTemperatureOf(IThermalPlace place) {
        place.updateTemperature(increasePerTick);
    }
}
