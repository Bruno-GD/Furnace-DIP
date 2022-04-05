package edu.poniperro.furnace.thermalregulators;

import edu.poniperro.furnace.heaters.IHeater;
import edu.poniperro.furnace.thermaldisplays.BasicDisplay;
import edu.poniperro.furnace.thermaldisplays.IThermalDisplay;
import edu.poniperro.furnace.thermalplaces.IThermalPlace;
import edu.poniperro.furnace.thermalsensors.IThermalSensor;

public class Regulator implements IThermalRegulator {
    private final IThermalDisplay screen = new BasicDisplay();

    @Override
    public void regulate(IThermalSensor sensor, IHeater heater, IThermalPlace place, double maxTemperature, double minTemperature) {
        double current = sensor.getCurrentTemperatureOf(place);
        screen.display(RegulatorState.TURN_ON, current);
        // increase
        while (current < maxTemperature) {
            // update temperature
            heater.increaseTemperatureOf(place);
            current = sensor.getCurrentTemperatureOf(place);
            // display temperature
            screen.display(RegulatorState.HEATING, current);
        }
        screen.display(RegulatorState.OFF, current);
        // decrease
        while (current > minTemperature) {
            // update temperature
            place.freeze();
            current = sensor.getCurrentTemperatureOf(place);
            // display temperature
            screen.display(RegulatorState.WAITING, current);
        }
    }
}
