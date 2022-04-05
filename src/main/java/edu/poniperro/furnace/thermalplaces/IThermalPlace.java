package edu.poniperro.furnace.thermalplaces;

public interface IThermalPlace {

    /**
     * @return the temperature of the place (requires a IThermalSensor)
     */
    double getTemperature();

    /**
     * @param celsius the celsius to increase
     */
    void updateTemperature(double celsius);

    /**
     * When there's no heater, the place will decrease the temperature!
     */
    void freeze();
}
