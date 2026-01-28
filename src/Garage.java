import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Добавлено в гараж: " + vehicle.getInfo());
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
        System.out.println("Удалено из гаража: " + vehicle.getInfo());
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
