import java.util.ArrayList;

public class BuilderPattern {
    public static void main(String[] str) {
        Vehicle car = new Vehicle.VehicleBuilder("2000cc", 4, "206").setOptional(2, 4).build();
        Vehicle motor = new Vehicle.VehicleBuilder("200cc",2,"ns").build();
        ArrayList<Object> carArray = new ArrayList<>();
        carArray.add(car.getEngine());
        carArray.add(car.getWheel());
        carArray.add(car.getModel());
        carArray.add(car.getAirbags());
        carArray.add(car.getPassenger());
        ArrayList<Object> motorArray = new ArrayList<>();
        motorArray.add(motor.getEngine());
        motorArray.add(motor.getWheel());
        motorArray.add(motor.getModel());
        motorArray.add(motor.getAirbags());
        motorArray.add(motor.getPassenger());
        System.out.println("My car :" + carArray);
        System.out.println("My motor :" + motorArray);
    }
}
