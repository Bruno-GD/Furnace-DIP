package edu.poniperro.furnace.thermaldisplays;

import edu.poniperro.furnace.thermalregulators.RegulatorState;
import edu.poniperro.furnace.thermalsensors.IThermalSensor;

public class BasicDisplay implements IThermalDisplay {
    private final String RED = "\u001B[31m";
    private final String BLUE = "\u001B[34m";
    private final String RESET = "\u001B[0m";

    @Override
    public void display(RegulatorState state, double temperature) {
        switch (state) {
            case OFF -> System.out.println("Apagado");
            case TURN_ON -> System.out.println("Encendiendo");
            case HEATING -> System.out.printf("%sCalentando ▲ %s| %.2f%n", RED, RESET, temperature);
            case WAITING -> System.out.printf("%sEsperando ▼ %s| %.2f%n", BLUE, RESET, temperature);
        }
    }
}
