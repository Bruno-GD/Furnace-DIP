package edu.poniperro.furnace.thermalregulators;

import edu.poniperro.furnace.heaters.IHeater;
import edu.poniperro.furnace.thermalplaces.IThermalPlace;
import edu.poniperro.furnace.thermalsensors.IThermalSensor;

public class Regulator implements IThermalRegulator {

    @Override
    public void regulate(IThermalSensor sensor, IHeater heater, IThermalPlace place, double maxTemperature, double minTemperature) {
        double current = sensor.getCurrentTemperatureOf(place);
        // increase
        while (current <= maxTemperature) {
            // update temperature
            heater.increaseTemperatureOf(place);
            current = sensor.getCurrentTemperatureOf(place);
            // TODO better way to show temperature
            System.out.printf("Temperatura actual: %.2fºC%n", current);
        }
        // decrease
        while (current >= minTemperature) {
            // update temperature
            place.freeze();
            current = sensor.getCurrentTemperatureOf(place);
            // TODO better way to show temperature
            System.out.printf("Temperatura actual: %.2fºC%n", current);
        }
    }
}
