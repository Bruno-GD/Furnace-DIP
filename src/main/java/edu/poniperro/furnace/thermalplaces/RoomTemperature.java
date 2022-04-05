package edu.poniperro.furnace.thermalplaces;

public class RoomTemperature implements IThermalPlace {
    private Double temperature = 0d;

    @Override
    public double getTemperature() {
        return this.temperature;
    }

    @Override
    public void updateTemperature(double celsius) {
        this.temperature = celsius;
    }
}
