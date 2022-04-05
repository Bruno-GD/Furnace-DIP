package edu.poniperro.furnace.thermaldisplays;

import edu.poniperro.furnace.thermalregulators.RegulatorState;
import edu.poniperro.furnace.thermalsensors.IThermalSensor;

public interface IThermalDisplay {

    /**
     * @param state of the regulator
     * @param temperature of the place (from sensor!)
     */
    void display(RegulatorState state, double temperature);
}
