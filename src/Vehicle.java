public class Vehicle {
    //required parameter
    private final String engine;
    private final int wheel;
    private final String model;

    //optional parameter
    private final int airbags;
    private final int passenger;

    public Vehicle(String engine, int wheel, String model, int airbags, int passenger) {
        this.engine = engine;
        this.wheel = wheel;
        this.model = model;
        this.airbags = airbags;
        this.passenger = passenger;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public String getModel() {
        return model;
    }

    public int getAirbags() {
        return airbags;
    }

    public int getPassenger() {
        return passenger;
    }
}
