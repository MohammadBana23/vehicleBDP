class Vehicle {
    //required parameter
    private String engine;
    private int wheel;
    private String model;

    //optional parameter
    private int airbags;
    private int passenger;

    private Vehicle(VehicleBuilder builder) {
        this.engine = builder.engine;
        this.wheel = builder.wheel;
        this.model = builder.model;
        this.airbags = builder.airbags;
        this.passenger = builder.passenger;
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

    public static class VehicleBuilder {

        private String engine;
        private int wheel;
        private String model;

        private int airbags;
        private int passenger;

        public VehicleBuilder(String engine, int wheel, String model) {
            this.engine = engine;
            this.wheel = wheel;
            this.model = model;
        }
        public VehicleBuilder setOptional(int airbags,int passenger){
            this.airbags = airbags;
            this.passenger = passenger;
            return this;
        }
        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}
