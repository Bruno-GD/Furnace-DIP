package edu.poniperro.furnace;

import edu.poniperro.furnace.heaters.GasHeater;
import edu.poniperro.furnace.heaters.IHeater;
import edu.poniperro.furnace.thermalplaces.IThermalPlace;
import edu.poniperro.furnace.thermalplaces.RoomTemperature;
import edu.poniperro.furnace.thermalregulators.IThermalRegulator;
import edu.poniperro.furnace.thermalregulators.Regulator;
import edu.poniperro.furnace.thermalsensors.IThermalSensor;
import edu.poniperro.furnace.thermalsensors.RemoteCommandSensor;

public class App {

    public static void main(String[] args) {
        final double minTemp = 15d;
        final double maxTemp = 21d;

        IThermalPlace room = new RoomTemperature(15d);
        IHeater gasHeater = new GasHeater();
        IThermalSensor thermometer = new RemoteCommandSensor();

        IThermalRegulator regulator = new Regulator();

        System.out.println("Arrancando...");
        regulator.regulate(thermometer, gasHeater, room, maxTemp, minTemp);
    }
}
