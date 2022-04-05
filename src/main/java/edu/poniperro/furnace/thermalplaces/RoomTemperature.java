package edu.poniperro.furnace.thermalplaces;

public class RoomTemperature implements IThermalPlace {
    private Double temperature;

    public RoomTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return this.temperature;
    }

    @Override
    public void updateTemperature(double celsius) {
        this.temperature += celsius;
    }

    @Override
    public void freeze() {
        this.temperature -= 1;
    }
}
